package org.sonatype.licensing.internal;

import javax.inject.Named;
import org.sonatype.licensing.LicenseKey;
import org.sonatype.licensing.LicensingException;
import org.sonatype.licensing.feature.Feature;
import org.sonatype.licensing.feature.FeatureValidator;

//@Named("licensing.default")
public class DefaultFeatureValidator implements FeatureValidator {
  public boolean isValid(Feature paramFeature, LicenseKey paramLicenseKey) {
    return (paramLicenseKey.isEvaluation() || paramLicenseKey.getFeatureSet().hasFeature(paramFeature));
  }
  
  public void validate(Feature paramFeature, LicenseKey paramLicenseKey) throws LicensingException {
    if (!isValid(paramFeature, paramLicenseKey))
      throw new LicensingException("License does not permit use of feature '" + paramFeature.getId() + "'"); 
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\internal\DefaultFeatureValidator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */