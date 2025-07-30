package codeguard.licensing;

import de.schlichtherle.license.LicenseParamDe;
import java.util.prefs.Preferences;

public class rkn implements LicenseParamDe {
  private final String eui;
  
  private final Preferences mif;
  
  private final eui bao;
  
  private final omj bab;
  
  public rkn(String paramString, Preferences paramPreferences, eui parameui, omj paramomj) {
    this.eui = paramString;
    this.mif = paramPreferences;
    this.bao = parameui;
    this.bab = paramomj;
  }
  
  public String getSubject() {
    return this.eui;
  }
  
  public Preferences getPreferences() {
    return this.mif;
  }
  
  public eui getKeyStoreParam() {
    return this.bao;
  }
  
  public omj getCipherParam() {
    return this.bab;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\rkn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */