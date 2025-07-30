package codeguard.licensing;

import de.schlichtherle.license.LicenseContent;
import java.util.prefs.Preferences;

public abstract class ajd extends rkn implements chr {
  private static final String mcv = baj.omj((new Obfuscator(new long[] { 3518397844622038312L, 5283581152211342346L, -5949173903170142050L, 5400406727937919437L })).toString());
  
  private final eui yhl;
  
  private final int jfe;
  
  protected ajd(String paramString, Preferences paramPreferences, eui parameui1, eui parameui2, int paramInt, omj paramomj) {
    super(paramString, paramPreferences, parameui1, paramomj);
    this.yhl = parameui2;
    this.jfe = paramInt;
  }
  
  public LicenseContent createFTPLicenseContent() {
    LicenseContent licenseContent = new LicenseContent();
    licenseContent.setInfo(mcv);
    return licenseContent;
  }
  
  public eui getFTPKeyStoreParam() {
    return this.yhl;
  }
  
  public int getFTPDays() {
    return this.jfe;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\ajd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */