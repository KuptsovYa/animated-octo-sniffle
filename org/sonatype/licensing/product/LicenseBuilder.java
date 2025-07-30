package org.sonatype.licensing.product;

import org.sonatype.licensing.LicensingException;
import org.sonatype.licensing.trial.TrialLicenseParam;

public interface LicenseBuilder {
  TrialLicenseParam buildPublicParam() throws LicensingException;
  
  String getPublicKeyStorePath();
  
  String getPublicKeyStorePassword();
  
  String getPublicKeyStoreAlias();
  
  String getTrialKeyStorePassword();
  
  String getTrialKeyStoreAlias();
  
  String getTrialKeyStorePath();
  
  String getPreferenceNodePath();
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\LicenseBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */