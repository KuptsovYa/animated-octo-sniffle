package org.sonatype.licensing.feature;

import org.sonatype.licensing.LicensingException;

public interface LicenseFeatureVerifier {
  void verifyLicenseAndFeature(Feature paramFeature) throws LicensingException;
  
  boolean verify(Feature paramFeature);
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\feature\LicenseFeatureVerifier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */