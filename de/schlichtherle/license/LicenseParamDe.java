package de.schlichtherle.license;

import codeguard.licensing.eui;
import codeguard.licensing.omj;
import java.util.prefs.Preferences;

public interface LicenseParamDe {
  String getSubject();

  Preferences getPreferences();
  
  eui getKeyStoreParam();
  
  omj getCipherParam();
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\de\schlichtherle\license\LicenseParam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */