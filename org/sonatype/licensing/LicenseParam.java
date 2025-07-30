package org.sonatype.licensing;

import codeguard.licensing.eui;
import codeguard.licensing.omj;
import codeguard.licensing.zxn;
import de.schlichtherle.license.LicenseParamDe;
import java.util.prefs.Preferences;
import org.sonatype.licensing.internal.DefaultKeyStoreParam;

public final class LicenseParam implements LicenseParamDe {
  private final String eui;
  
  private final Preferences mif;
  
  private final eui bao;
  
  private final omj bab;
  
  public LicenseParam(String paramString1, Preferences paramPreferences, Class<?> paramClass, String paramString2, String paramString3, String paramString4, String paramString5) {
    this.eui = paramString1;
    this.mif = paramPreferences;
    this.bao = (eui)new DefaultKeyStoreParam(paramClass, paramString2, paramString3, paramString4, paramString5);
    this.bab = (omj)new zxn((paramString5 != null) ? paramString5 : paramString4);
  }
  
  public omj getCipherParam() {
    return this.bab;
  }
  
  public eui getKeyStoreParam() {
    return this.bao;
  }
  
  public Preferences getPreferences() {
    return this.mif;
  }
  
  public String getSubject() {
    return this.eui;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\LicenseParam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */