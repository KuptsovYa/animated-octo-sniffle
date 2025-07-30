package codeguard.licensing;

import de.schlichtherle.license.LicenseContent;
import de.schlichtherle.license.LicenseContentException;
import de.schlichtherle.license.NoLicenseInstalledException;
import de.schlichtherle.xml.GenericCertificate;
import java.io.File;
import org.sonatype.licensing.CustomLicenseContent;
import org.sonatype.licensing.LicenseValidator;
import org.sonatype.licensing.trial.TrialLicenseParam;

public class tpg extends zts {
  private final LicenseValidator mus;
  
  public tpg(TrialLicenseParam paramTrialLicenseParam, LicenseValidator paramLicenseValidator) {
    super((chr)paramTrialLicenseParam);
    if (paramLicenseValidator == null) {
      this.mus = new LicenseValidator1();
    } else {
      this.mus = paramLicenseValidator;
    } 
  }
  
  protected synchronized CustomLicenseContent zxn(byte[] paramArrayOfbyte, pnd parampnd) throws Exception {
    return new CustomLicenseContent(super.itm(paramArrayOfbyte, parampnd));
  }
  
  protected synchronized CustomLicenseContent omj(File paramFile, pnd parampnd) throws Exception {
    return new CustomLicenseContent(super.itm(paramFile, parampnd));
  }
  
  protected synchronized CustomLicenseContent clk(byte[] paramArrayOfbyte, pnd parampnd) throws Exception {
    return new CustomLicenseContent(super.omj(paramArrayOfbyte, parampnd));
  }
  
  protected synchronized CustomLicenseContent omj(pnd parampnd) throws Exception {
    try {
      return (CustomLicenseContent)zxn(parampnd);
    } catch (LicenseContentException licenseContentException) {
      throw licenseContentException;
    } catch (Exception exception) {
      return new CustomLicenseContent(super.itm(parampnd));
    } 
  }
  
  protected synchronized LicenseContent zxn(pnd parampnd) throws Exception {
    GenericCertificate genericCertificate = bab();
    if (genericCertificate != null)
      return (LicenseContent)genericCertificate.getContent(); 
    byte[] arrayOfByte = vep();
    if (arrayOfByte == null)
      throw new NoLicenseInstalledException(eui().getSubject()); 
    genericCertificate = pnd().zxn(arrayOfByte);
    parampnd.omj(genericCertificate);
    LicenseContent licenseContent = (LicenseContent)genericCertificate.getContent();
    zxn(licenseContent);
    itm(genericCertificate);
    return licenseContent;
  }
  
  public CustomLicenseContent rkn(File paramFile) throws Exception {
    return new CustomLicenseContent(itm(omj(paramFile)));
  }
  
  protected synchronized void zxn(LicenseContent paramLicenseContent) throws LicenseContentException {
    this.mus.validate(paramLicenseContent, eui());
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\tpg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */