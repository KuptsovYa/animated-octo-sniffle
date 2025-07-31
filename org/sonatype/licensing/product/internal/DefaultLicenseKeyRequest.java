package org.sonatype.licensing.product.internal;

import codeguard.licensing.agq;
import codeguard.licensing.aua;
import codeguard.licensing.bjw;
import codeguard.licensing.bos;
import codeguard.licensing.haa;
import codeguard.licensing.omz;
import codeguard.licensing.whz;
import java.io.IOException;
import java.io.StringWriter;
import java.util.*;
import javax.inject.Inject;
import javax.inject.Named;
import javax.security.auth.x500.X500Principal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonatype.licensing.ProductDetails;
import org.sonatype.licensing.feature.Feature;
import org.sonatype.licensing.product.SslKeyContainer;
import org.sonatype.licensing.util.LicensingUtil;

//@Named("licensing.default")
public class DefaultLicenseKeyRequest extends bos implements ProductLicenseKeyRequest {
  private final Logger fjz = LoggerFactory.getLogger(DefaultLicenseKeyRequest.class);
  
  private static final String xbb = LicensingUtil.unobfuscate(new long[] { -1075740369556149950L, 6473667505195108430L });
  
  private static final String eur = LicensingUtil.unobfuscate(new long[] { 5431597888647840358L, -3003659393323666576L });
  
  private static final String sux = LicensingUtil.unobfuscate(new long[] { -2011739764646339905L, 1056792054092558862L });
  
  private boolean ymv;
  
  private int bzn = -1;
  
  private SslKeyContainer[] sjl = new SslKeyContainer[0];
  
  private final ProductDetails xrw;
  
  private Collection<String> zir = Collections.emptySet();
  
  private Properties kxn = new Properties();
  
  @Inject
  public DefaultLicenseKeyRequest(ProductDetails paramProductDetails) {
    super(paramProductDetails);
    this.xrw = paramProductDetails;
  }
  
  public boolean isFreeLicense() {
    return this.ymv;
  }
  
  public void setFreeLicense(boolean paramBoolean) {
    this.ymv = paramBoolean;
  }
  
  public int getLicensedUsers() {
    return this.bzn;
  }
  
  public void setLicensedUsers(int paramInt) {
    this.bzn = paramInt;
  }
  
  public X500Principal getIssuer() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("CN=").append(xbb).append(", ");
    stringBuilder.append("OU=").append(this.xrw.getBrandName()).append(", ");
    stringBuilder.append("O=").append(this.xrw.getBrandName()).append(", ");
    stringBuilder.append("L=").append(eur).append(", ");
    stringBuilder.append("C=").append(sux);
    return new X500Principal(stringBuilder.toString());
  }
  
  public String getExtraContent() {
    agq agq = new agq();
    agq.mif("1.0.2");
    agq.setEvaluation(isEvaluation());
    agq.setFreeLicense(isFreeLicense());
    agq.setLicensedUsers(getLicensedUsers());
    for (String str : getLicensedProducts()) {
      bjw bjw = new bjw();
      bjw.rkn(str);
      agq.itm(bjw);
    } 
    for (Feature feature : getFeatureSet()) {
      whz whz = new whz();
      whz.rkn(feature.getId());
      agq.itm(whz);
    } 
    for (SslKeyContainer sslKeyContainer : getKeys()) {
      haa haa = new haa();
      haa.setEntry(sslKeyContainer.getEntry());
      haa.setPassword(sslKeyContainer.getPassword());
      haa.bao(sslKeyContainer.getType().toString());
      agq.itm(haa);
    } 
    Properties properties = getProperties();
    for (Object str1 : properties.keySet()) {
      String str2 = (String) str1;
      aua aua = new aua();
      aua.bab(str2);
      aua.vep(properties.getProperty(str2));
      agq.itm(aua);
    } 
    StringWriter stringWriter = new StringWriter();
    omz omz = new omz();
    try {
      omz.itm(stringWriter, agq);
      return stringWriter.toString();
    } catch (IOException iOException) {
      this.fjz.error("Unable to store license content properly", iOException);
      return null;
    } 
  }
  
  public List<SslKeyContainer> getKeys() {
    return Arrays.asList(this.sjl);
  }
  
  public void setKeys(SslKeyContainer[] paramArrayOfSslKeyContainer) {
    this.sjl = paramArrayOfSslKeyContainer;
  }
  
  public void setLicensedProducts(Collection<String> paramCollection) {
    this.zir = paramCollection;
  }
  
  public Collection<String> getLicensedProducts() {
    return this.zir;
  }
  
  public Properties getProperties() {
    return this.kxn;
  }
  
  public void setProperties(Properties paramProperties) {
    this.kxn = paramProperties;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\internal\DefaultLicenseKeyRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */