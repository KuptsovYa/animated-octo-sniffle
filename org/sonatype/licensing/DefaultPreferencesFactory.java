package org.sonatype.licensing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.prefs.Preferences;
import javax.inject.Named;

//@Named("licensing.default")
@Qualifier("DefaultPreferencesFactory")
@Component
public class DefaultPreferencesFactory implements PreferencesFactory {
  public Preferences nodeForPackage(Class<?> paramClass) {
    return Preferences.userNodeForPackage(paramClass);
  }
  
  public Preferences nodeForPath(String paramString) {
    return Preferences.userRoot().node(paramString);
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\DefaultPreferencesFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */