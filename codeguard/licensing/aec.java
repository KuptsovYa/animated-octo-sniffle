package codeguard.licensing;

import de.schlichtherle.license.LicenseContent;
import de.schlichtherle.license.LicenseContentException;
import de.schlichtherle.license.LicenseParamDe;
import java.io.File;
import org.sonatype.licensing.CustomLicenseContent;
import org.sonatype.licensing.LicenseValidator;

public class aec extends bab {
  private final LicenseValidator licenseValidator;
  
  public aec(LicenseParamDe paramLicenseParam, LicenseValidator paramLicenseValidator) {
    super((LicenseParamDe)paramLicenseParam);
    if (paramLicenseValidator == null) {
      this.licenseValidator = new LicenseValidator1();
    } else {
      this.licenseValidator = paramLicenseValidator;
    } 
  }
  
  protected synchronized LicenseContent itm(byte[] paramArrayOfbyte, pnd parampnd) throws Exception {
    return (LicenseContent)new CustomLicenseContent(super.itm(paramArrayOfbyte, parampnd));
  }
  
  protected synchronized LicenseContent itm(File paramFile, pnd parampnd) throws Exception {
    return (LicenseContent)new CustomLicenseContent(super.itm(paramFile, parampnd));
  }
  
  protected synchronized LicenseContent omj(byte[] paramArrayOfbyte, pnd parampnd) throws Exception {
    return (LicenseContent)new CustomLicenseContent(super.omj(paramArrayOfbyte, parampnd));
  }
  
  protected synchronized LicenseContent itm(pnd parampnd) throws Exception {
    return (LicenseContent)new CustomLicenseContent(super.itm(parampnd));
  }
  
  public CustomLicenseContent rkn(File paramFile) throws Exception {
    return new CustomLicenseContent(itm(omj(paramFile)));
  }
  
  protected synchronized void zxn(LicenseContent paramLicenseContent) throws LicenseContentException {
    this.licenseValidator.validate(paramLicenseContent, eui());
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\aec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */