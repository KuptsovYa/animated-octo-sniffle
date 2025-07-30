package de.schlichtherle.license;

import codeguard.licensing.bxh;
import java.security.GeneralSecurityException;

public class LicenseNotaryException extends GeneralSecurityException {
  private static final long vep = 1L;
  
  private String clk;
  
  public LicenseNotaryException(String paramString1, String paramString2) {
    super(paramString1);
    this.clk = paramString2;
  }
  
  public String getLocalizedMessage() {
    return bxh.itm(getMessage(), this.clk);
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\de\schlichtherle\license\LicenseNotaryException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */