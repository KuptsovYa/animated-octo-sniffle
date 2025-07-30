package org.sonatype.licensing;

import de.schlichtherle.license.LicenseContent;
import de.schlichtherle.license.LicenseContentException;
import de.schlichtherle.license.LicenseParamDe;

public interface LicenseValidator {
  void validate(LicenseContent paramLicenseContent, LicenseParamDe paramLicenseParam) throws LicenseContentException;
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\LicenseValidator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */