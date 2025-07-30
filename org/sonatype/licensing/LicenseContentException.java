package org.sonatype.licensing;

import de.schlichtherle.license.LicenseContent;
import de.schlichtherle.license.LicenseContentException;

public class LicenseContentException extends LicenseContentException {
  private final LicenseContent tex;
  
  public LicenseContentException(String paramString, LicenseContent paramLicenseContent) {
    super(paramString);
    this.tex = paramLicenseContent;
  }
  
  public LicenseContent getLicenseContent() {
    return this.tex;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\LicenseContentException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */