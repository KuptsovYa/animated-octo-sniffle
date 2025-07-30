package de.schlichtherle.license;

import codeguard.licensing.bxh;

public class LicenseContentException extends Exception {
  private static final long vep = 1L;
  
  public LicenseContentException(String paramString) {
    super(paramString);
  }
  
  public String getLocalizedMessage() {
    return bxh.omj(getMessage());
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\de\schlichtherle\license\LicenseContentException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */