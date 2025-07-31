package codeguard.licensing;

import de.schlichtherle.license.LicenseContent;
import org.sonatype.licensing.LicenseContentException;
import de.schlichtherle.license.LicenseParamDe;
import java.util.Date;
import java.util.Locale;
import java.util.prefs.Preferences;

import org.sonatype.licensing.LicenseValidator;

public class LicenseValidator1 implements LicenseValidator {
  private static final String xlf = (new Obfuscator(new long[] { -9211605111142713620L, 391714365510707393L, -7356761750428556372L, 6379560902598103028L })).toString();
  
  private static final String lsy = (new Obfuscator(new long[] { 7150026245468079143L, 6314884536402738366L, -1360923923476698800L })).toString();
  
  private static final String brx = (new Obfuscator(new long[] { -3034693013076752554L, -1011266899694033610L, 6775785917404597234L })).toString();
  
  private static final String mts = (new Obfuscator(new long[] { -6084371209004858580L, 3028840747031697166L, -3524637886726219307L })).toString();
  
  private static final String xae = (new Obfuscator(new long[] { 1000558500458715757L, -6998261911041258483L, -5490039629745846648L, 3561172928787106880L })).toString();
  
  private static final String rog = (new Obfuscator(new long[] { -3274088377466921882L, -1704115158449736962L, -1134622897105293263L, 2875630655915253859L })).toString();
  
  private static final String hep = (new Obfuscator(new long[] { -3559580260061340089L, 8807812719464926891L, 3255622466169980128L, 3208430498260873670L, 8772089725159421213L })).toString();
  
  private static final String ygy = (new Obfuscator(new long[] { 6854702630454082314L, -1676630527348424687L, 4853969635229547239L, -7087814313396201500L, 7133601245775504376L })).toString();
  
  private static final String jke = (new Obfuscator(new long[] { -5670394608177286583L, -3674104453170648872L, 4159301984262248157L, 7442355638167795990L, 4780252201915657674L })).toString();
  
  private static final String djy = (new Obfuscator(new long[] { -6950934198262740461L, -10280221617836935L })).toString();
  
  public void validate(LicenseContent paramLicenseContent, LicenseParamDe paramLicenseParam) throws LicenseContentException {
    String str1 = paramLicenseContent.getSubject().toLowerCase(Locale.US);
    String str2 = paramLicenseParam.getSubject().toLowerCase(Locale.US);
    itm(paramLicenseContent, str1, str2);
    if (paramLicenseContent.getHolder() == null)
      throw itm(lsy, paramLicenseContent); 
    if (paramLicenseContent.getIssuer() == null)
      throw itm(brx, paramLicenseContent); 
    if (paramLicenseContent.getIssued() == null)
      throw itm(mts, paramLicenseContent); 
    Date date1 = new Date();
    Date date2 = paramLicenseContent.getNotAfter();
    if (date2 != null && date1.after(date2))
      throw itm(xae, paramLicenseContent); 
    String str3 = paramLicenseContent.getConsumerType();
    if (str3 == null)
      throw itm(rog, paramLicenseContent); 
    Preferences preferences = paramLicenseParam.getPreferences();
    if (preferences != null && preferences.isUserNode()) {
      if (!djy.equalsIgnoreCase(str3))
        throw itm(hep, paramLicenseContent); 
      if (paramLicenseContent.getConsumerAmount() != 1)
        throw itm(ygy, paramLicenseContent); 
    } else if (paramLicenseContent.getConsumerAmount() <= 0) {
      throw itm(jke, paramLicenseContent);
    } 
  }
  
  protected void itm(LicenseContent paramLicenseContent, String paramString1, String paramString2) throws LicenseContentException {
    if (paramString1 == null || !paramString1.contains(paramString2))
      throw itm(xlf, paramLicenseContent); 
  }
  
  private LicenseContentException itm(String paramString, LicenseContent paramLicenseContent) {
    return (LicenseContentException)new LicenseContentException(paramString, paramLicenseContent);
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\zsv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */