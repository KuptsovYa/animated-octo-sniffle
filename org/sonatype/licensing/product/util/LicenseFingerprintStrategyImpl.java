package org.sonatype.licensing.product.util;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.inject.Named;
import javax.inject.Singleton;
import org.sonatype.licensing.product.ProductLicenseKey;
import org.sonatype.licensing.product.SslKeyContainer;

@Named
@Singleton
public class LicenseFingerprintStrategyImpl implements LicenseFingerprintStrategy {
  public String calculate(ProductLicenseKey paramProductLicenseKey) {
    MessageDigest messageDigest;
    Preconditions.checkArgument((paramProductLicenseKey.getRawFeatures() != null), "Product License Key has null raw features");
    Preconditions.checkArgument((paramProductLicenseKey.getSslKeys() != null), "Product License Key has null ssl keys");
    try {
      messageDigest = MessageDigest.getInstance("SHA-1");
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      throw new IllegalStateException(noSuchAlgorithmException);
    } 
    itm(messageDigest, paramProductLicenseKey.getContactCompany());
    itm(messageDigest, paramProductLicenseKey.getContactCountry());
    itm(messageDigest, paramProductLicenseKey.getContactEmailAddress());
    itm(messageDigest, paramProductLicenseKey.getContactName());
    itm(messageDigest, paramProductLicenseKey.getContactTelephone());
    itm(messageDigest, paramProductLicenseKey.getEffectiveDate());
    itm(messageDigest, paramProductLicenseKey.getExpirationDate());
    itm(messageDigest, paramProductLicenseKey.getLicensedUsers());
    messageDigest.update((byte)(paramProductLicenseKey.isEvaluation() ? 1 : 0));
    messageDigest.update((byte)(paramProductLicenseKey.isFreeLicense() ? 1 : 0));
    ArrayList<String> arrayList = Lists.newArrayList(paramProductLicenseKey.getRawFeatures());
    Collections.sort(arrayList);
    for (String str : arrayList)
      itm(messageDigest, str); 
    for (SslKeyContainer sslKeyContainer : paramProductLicenseKey.getSslKeys()) {
      itm(messageDigest, sslKeyContainer.getType().name());
      itm(messageDigest, sslKeyContainer.getPassword());
      itm(messageDigest, sslKeyContainer.getEntry());
    } 
    byte[] arrayOfByte = messageDigest.digest();
    StringBuilder stringBuilder = new StringBuilder(arrayOfByte.length * 2);
    for (byte b = 0; b < arrayOfByte.length; b++) {
      int i = arrayOfByte[b] & 0xFF;
      if (i < 16)
        stringBuilder.append('0'); 
      stringBuilder.append(Integer.toHexString(i));
    } 
    return stringBuilder.toString();
  }
  
  private void itm(MessageDigest paramMessageDigest, String paramString) {
    if (paramString != null)
      try {
        paramMessageDigest.update(paramString.getBytes("UTF-8"));
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        throw new IllegalStateException(unsupportedEncodingException);
      }  
  }
  
  private void itm(MessageDigest paramMessageDigest, Date paramDate) {
    if (paramDate != null)
      itm(paramMessageDigest, paramDate.getTime()); 
  }
  
  private void itm(MessageDigest paramMessageDigest, long paramLong) {
    byte[] arrayOfByte = new byte[8];
    arrayOfByte[0] = (byte)(int)(paramLong >> 56L & 0xFFL);
    arrayOfByte[1] = (byte)(int)(paramLong >> 48L & 0xFFL);
    arrayOfByte[2] = (byte)(int)(paramLong >> 40L & 0xFFL);
    arrayOfByte[3] = (byte)(int)(paramLong >> 32L & 0xFFL);
    arrayOfByte[4] = (byte)(int)(paramLong >> 24L & 0xFFL);
    arrayOfByte[5] = (byte)(int)(paramLong >> 16L & 0xFFL);
    arrayOfByte[6] = (byte)(int)(paramLong >> 8L & 0xFFL);
    arrayOfByte[7] = (byte)(int)(paramLong >> 0L & 0xFFL);
    paramMessageDigest.update(arrayOfByte, 0, 8);
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\produc\\util\LicenseFingerprintStrategyImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */