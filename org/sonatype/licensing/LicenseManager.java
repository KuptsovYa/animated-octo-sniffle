package org.sonatype.licensing;

import java.io.File;
import org.sonatype.licensing.feature.Feature;

public interface LicenseManager {
  LicenseKey createLicense(LicenseParam paramLicenseParam, LicenseKeyRequest paramLicenseKeyRequest) throws LicensingException;
  
  LicenseKey installLicense(LicenseParam paramLicenseParam, File paramFile) throws LicensingException;
  
  void uninstallLicense(LicenseParam paramLicenseParam) throws LicensingException;
  
  LicenseKey verifyLicense(LicenseParam paramLicenseParam) throws LicensingException;
  
  LicenseKey verifyLicense(LicenseParam paramLicenseParam, File paramFile) throws LicensingException;
  
  void validateFeature(LicenseKey paramLicenseKey, Feature paramFeature) throws LicensingException;
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\LicenseManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */