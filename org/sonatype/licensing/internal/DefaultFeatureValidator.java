package org.sonatype.licensing.internal;

import javax.inject.Named;
import org.sonatype.licensing.LicenseKey;
import org.sonatype.licensing.LicensingException;
import org.sonatype.licensing.feature.Feature;
import org.sonatype.licensing.feature.FeatureValidator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Named("licensing.default")
@Qualifier("DefaultFeatureValidator")
@Service
public class DefaultFeatureValidator implements FeatureValidator {
  public boolean isValid(Feature paramFeature, LicenseKey paramLicenseKey) {
    return true;
  }
  
  public void validate(Feature paramFeature, LicenseKey paramLicenseKey) throws LicensingException {

  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\internal\DefaultFeatureValidator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */