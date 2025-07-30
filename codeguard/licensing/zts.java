package codeguard.licensing;

import de.schlichtherle.license.LicenseContent;
import de.schlichtherle.license.LicenseParamDe;
import de.schlichtherle.license.NoLicenseInstalledException;
import java.util.Calendar;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

public class zts extends bab {
  private static final String tlv = (new Obfuscator(new long[] { 6540942263743768505L, -6059958959638303164L, 6377465279464853391L })).toString();
  
  private static final String bqj = (new Obfuscator(new long[] { 5508595700258006979L, 4658549383733098011L, 4696761698113697678L, 7544341226212718087L, 8821059208312938461L, 302546095417378367L, 4227466611521490562L, -1772332321125311578L })).toString();
  
  private static final String dyd = (new Obfuscator(new long[] { 8356037110043899424L, 4664078144517272142L })).toString();
  
  private pnd ews;
  
  private static final String pid = seo + baj.omj((new Obfuscator(new long[] { -6534999889298787160L, -4220048377725910008L })).toString());
  
  protected zts() {}
  
  public zts(chr paramchr) {
    omj(paramchr);
  }
  
  public synchronized void itm(LicenseParamDe paramLicenseParam) {
    omj(paramLicenseParam);
  }
  
  private void omj(LicenseParamDe paramLicenseParam) {
    chr chr = (chr)paramLicenseParam;
    eui eui = chr.getFTPKeyStoreParam();
    if (eui == null)
      throw new NullPointerException(tlv); 
    if (eui.equals(chr.getKeyStoreParam()))
      throw new IllegalArgumentException(bqj); 
    int i = chr.getFTPDays();
    if (0 >= i || i > 365)
      throw new IllegalArgumentException((new Obfuscator(new long[] { -8447909007698265338L, 3963998191526449092L })).toString());
    super.itm(chr);
  }
  
  protected synchronized LicenseContent itm(pnd parampnd) throws Exception {
    try {
      return super.itm(parampnd);
    } catch (Exception exception) {
      chr chr = (chr)eui();
      pnd pnd1 = klp();
      byte[] arrayOfByte = vep();
      if (arrayOfByte != null)
        return super.itm(pnd1); 
      if (!chr.isFTPEligible())
        throw new NoLicenseInstalledException(chr.getSubject()); 
      LicenseContent licenseContent = chr.createFTPLicenseContent();
      licenseContent.setNotAfter(itm(chr.getFTPDays()));
      licenseContent = itm(itm(licenseContent, pnd1), pnd1);
      chr.removeFTPEligibility();
      chr.ftpGranted(licenseContent);
      return licenseContent;
    } 
  }
  
  protected synchronized void omj(LicenseContent paramLicenseContent) {
    if (paramLicenseContent.getHolder() == null)
      paramLicenseContent.setHolder(new X500Principal(pid)); 
    super.omj(paramLicenseContent);
  }
  
  protected synchronized pnd klp() throws Exception {
    if (this.ews == null)
      this.ews = new pnd(((chr)eui()).getFTPKeyStoreParam()); 
    return this.ews;
  }
  
  protected Date itm(int paramInt) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(rkn());
    calendar.add(5, paramInt);
    return calendar.getTime();
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\zts.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */