package org.sonatype.licensing;

import java.util.prefs.Preferences;

public interface PreferencesFactory {
  Preferences nodeForPackage(Class<?> paramClass);
  
  Preferences nodeForPath(String paramString);
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\PreferencesFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */