package org.sonatype.licensing;

import de.schlichtherle.license.LicenseContent;

public class CustomLicenseContent extends LicenseContent {
  private static final long vep = 2744561669396670639L;
  
  public CustomLicenseContent() {}
  
  public CustomLicenseContent(LicenseContent paramLicenseContent) {
    setConsumerAmount(paramLicenseContent.getConsumerAmount());
    setConsumerType(paramLicenseContent.getConsumerType());
    setExtra(paramLicenseContent.getExtra());
    setHolder(paramLicenseContent.getHolder());
    setInfo(paramLicenseContent.getInfo());
    setIssued(paramLicenseContent.getIssued());
    setIssuer(paramLicenseContent.getIssuer());
    setNotAfter(paramLicenseContent.getNotAfter());
    setNotBefore(paramLicenseContent.getNotBefore());
    setSubject(paramLicenseContent.getSubject());
  }
  
  public LicenseContent getExtraLicenseContent() {
    return null;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\CustomLicenseContent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */