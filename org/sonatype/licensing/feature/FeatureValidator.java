package org.sonatype.licensing.feature;

import org.sonatype.licensing.LicenseKey;
import org.sonatype.licensing.LicensingException;

public interface FeatureValidator {
  boolean isValid(Feature paramFeature, LicenseKey paramLicenseKey);
  
  void validate(Feature paramFeature, LicenseKey paramLicenseKey) throws LicensingException;
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\feature\FeatureValidator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */