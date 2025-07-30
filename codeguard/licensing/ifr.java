package codeguard.licensing;

import de.schlichtherle.xml.GenericCertificate;
import de.schlichtherle.xml.PersistenceServiceException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class ifr {
  private static final String ztd = (new Obfuscator(new long[] { 2860604316472308139L, 5030391952891038168L, -6110818099732428353L })).toString();
  
  private omj wdm;
  
  private Cipher fyp;
  
  private SecretKey tbk;
  
  private AlgorithmParameterSpec nch;
  
  protected ifr() {}
  
  public ifr(omj paramomj) {
    omj(paramomj);
  }
  
  public omj getCipherParam() {
    return this.wdm;
  }
  
  public void itm(omj paramomj) {
    omj(paramomj);
  }
  
  private void omj(omj paramomj) {
    if (paramomj == null)
      throw new NullPointerException(pnd.dpq); 
    pwn.chr().itm(paramomj.getKeyPwd());
    this.wdm = paramomj;
    this.fyp = null;
    this.tbk = null;
    this.nch = null;
  }
  
  public byte[] zxn(GenericCertificate paramGenericCertificate) throws Exception {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new CipherOutputStream(byteArrayOutputStream, baj()));
    try {
      qeu.itm(paramGenericCertificate, gZIPOutputStream);
    } catch (PersistenceServiceException persistenceServiceException) {
      throw new AssertionError(persistenceServiceException);
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  public GenericCertificate zxn(byte[] paramArrayOfbyte) throws Exception {
    GenericCertificate genericCertificate;
    GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(qyf().doFinal(paramArrayOfbyte)));
    try {
      genericCertificate = (GenericCertificate)qeu.itm(gZIPInputStream);
    } finally {
      try {
        gZIPInputStream.close();
      } catch (IOException iOException) {}
    } 
    return genericCertificate;
  }
  
  protected Cipher baj() {
    Cipher cipher = qeu();
    try {
      cipher.init(1, this.tbk, this.nch);
    } catch (InvalidKeyException invalidKeyException) {
      throw new AssertionError(invalidKeyException);
    } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
      throw new AssertionError(invalidAlgorithmParameterException);
    } 
    return cipher;
  }
  
  protected Cipher qyf() {
    Cipher cipher = qeu();
    try {
      cipher.init(2, this.tbk, this.nch);
    } catch (InvalidKeyException invalidKeyException) {
      throw new AssertionError(invalidKeyException);
    } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
      throw new AssertionError(invalidAlgorithmParameterException);
    } 
    return cipher;
  }
  
  protected Cipher qeu() {
    if (this.fyp != null)
      return this.fyp; 
    this.nch = new PBEParameterSpec(new byte[] { -50, -5, -34, -84, 5, 2, 25, 113 }, 2005);
    try {
      PBEKeySpec pBEKeySpec = new PBEKeySpec(getCipherParam().getKeyPwd().toCharArray());
      SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(ztd);
      this.tbk = secretKeyFactory.generateSecret(pBEKeySpec);
      this.fyp = Cipher.getInstance(ztd);
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      throw new AssertionError(noSuchAlgorithmException);
    } catch (InvalidKeySpecException invalidKeySpecException) {
      throw new AssertionError(invalidKeySpecException);
    } catch (NoSuchPaddingException noSuchPaddingException) {
      throw new AssertionError(noSuchPaddingException);
    } 
    return this.fyp;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\ifr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */