package de.schlichtherle.license;

import codeguard.licensing.bxh;
import codeguard.licensing.Obfuscator;

public class NoLicenseInstalledException extends Exception {
  private static final long vep = 1L;
  
  private static final String fyi = (new Obfuscator(new long[] { 5636850220590995934L, -798521115123526970L, 3054112192777193179L, 881750348384376277L })).toString();
  
  public NoLicenseInstalledException(String paramString) {
    super(paramString);
  }
  
  public String getLocalizedMessage() {
    return bxh.itm(fyi, getMessage());
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\de\schlichtherle\license\NoLicenseInstalledException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */