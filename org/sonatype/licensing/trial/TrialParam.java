package org.sonatype.licensing.trial;

import org.sonatype.licensing.CustomLicenseContent;

public interface TrialParam {
  boolean isEligibleForTrial();
  
  void removeTrialEligibility();
  
  int getDaysForTrial();
  
  CustomLicenseContent createTrialLicenseContent();
  
  void trialGranted(CustomLicenseContent paramCustomLicenseContent);
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\trial\TrialParam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */