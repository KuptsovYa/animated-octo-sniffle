package org.sonatype.licensing.trial;

import java.io.File;
import org.sonatype.licensing.LicenseKey;
import org.sonatype.licensing.LicenseKeyRequest;
import org.sonatype.licensing.LicensingException;
import org.sonatype.licensing.feature.Feature;

public interface TrialLicenseManager {
  LicenseKey createLicense(TrialLicenseParam paramTrialLicenseParam, LicenseKeyRequest paramLicenseKeyRequest) throws LicensingException;
  
  LicenseKey installLicense(TrialLicenseParam paramTrialLicenseParam, File paramFile) throws LicensingException;
  
  void uninstallLicense(TrialLicenseParam paramTrialLicenseParam) throws LicensingException;
  
  LicenseKey verifyLicense(TrialLicenseParam paramTrialLicenseParam) throws LicensingException;
  
  LicenseKey verifyLicense(TrialLicenseParam paramTrialLicenseParam, File paramFile) throws LicensingException;
  
  void validateFeature(LicenseKey paramLicenseKey, Feature paramFeature) throws LicensingException;
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\trial\TrialLicenseManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */