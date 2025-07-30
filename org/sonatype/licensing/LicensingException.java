package org.sonatype.licensing;

public class LicensingException extends RuntimeException {
  private static final long vep = -7698990696599896544L;
  
  private static final String vbu = "Sonatype Product Licensing Exception";
  
  private LicenseKey bzt = null;
  
  public LicensingException(String paramString) {
    super(paramString);
  }
  
  public LicensingException(Throwable paramThrowable) {
    super("Sonatype Product Licensing Exception", paramThrowable);
  }
  
  public LicensingException(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public LicensingException(LicenseKey paramLicenseKey, String paramString, LicenseContentException paramLicenseContentException) {
    this(paramString, (Throwable)paramLicenseContentException);
    this.bzt = paramLicenseKey;
  }
  
  public LicenseKey getKey() {
    return this.bzt;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\LicensingException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */