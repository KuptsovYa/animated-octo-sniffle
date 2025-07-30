package codeguard.licensing;

import de.schlichtherle.license.LicenseContent;
import de.schlichtherle.license.LicenseParamDe;

public interface chr extends LicenseParamDe {
  eui getFTPKeyStoreParam();
  
  int getFTPDays();
  
  boolean isFTPEligible();
  
  LicenseContent createFTPLicenseContent();
  
  void removeFTPEligibility();
  
  void ftpGranted(LicenseContent paramLicenseContent);
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\chr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */