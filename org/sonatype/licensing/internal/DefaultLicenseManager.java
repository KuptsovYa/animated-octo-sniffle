package org.sonatype.licensing.internal;

import codeguard.licensing.aec;
import codeguard.licensing.LicenseValidator1;
import de.schlichtherle.license.LicenseContent;
import de.schlichtherle.license.LicenseContentException;
import java.io.File;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import org.sonatype.licensing.CustomLicenseContent;
import org.sonatype.licensing.LicenseKey;
import org.sonatype.licensing.LicenseKeyRequest;
import org.sonatype.licensing.LicenseManager;
import org.sonatype.licensing.LicenseParam;
import org.sonatype.licensing.LicenseValidator;
import org.sonatype.licensing.LicensingException;
import org.sonatype.licensing.feature.Feature;
import org.sonatype.licensing.feature.FeatureValidator;

//@Named("licensing.default")
@Deprecated
public class DefaultLicenseManager implements LicenseManager {
  private final Provider<LicenseKey> cgs;
  
  private final FeatureValidator fmh;
  
  private final LicenseValidator wst;
  
  public DefaultLicenseManager(Provider<LicenseKey> paramProvider,
                               FeatureValidator paramFeatureValidator) {
    this(paramProvider, paramFeatureValidator, (LicenseValidator)new LicenseValidator1());
  }
  
  @Inject
  public DefaultLicenseManager(Provider<LicenseKey> paramProvider, FeatureValidator paramFeatureValidator, @Nullable LicenseValidator paramLicenseValidator) {
    this.cgs = paramProvider;
    this.fmh = paramFeatureValidator;
    this.wst = paramLicenseValidator;
  }

  private void applyProLicense(LicenseKey key) {
    key.setContactName("Nikita");
    key.setContactCompany("MyCompany");
    key.setContactEmailAddress("nikita@example.com");
    key.setContactTelephone("1234567890");
    key.setContactCountry("Russia");
    key.setEvaluation(false);
    key.setExpirationDate(new java.util.Date(2038 - 1900, 0, 1));
    key.setEffectiveDate(new java.util.Date());
  }
  
  public LicenseKey createLicense(LicenseParam paramLicenseParam, LicenseKeyRequest paramLicenseKeyRequest) throws LicensingException {
    try {
      File file1 = paramLicenseKeyRequest.getLicenseKeyFile();
      File file2 = file1.getParentFile();
      if (!file2.exists())
        file2.mkdirs(); 
      aec AECBLYA = new aec(paramLicenseParam, this.wst);
      AECBLYA.itm((LicenseContent)paramLicenseKeyRequest.getLicenseContent(), file1);
    } catch (LicenseContentException licenseContentException) {
      throw new LicensingException(itm(licenseContentException), licenseContentException);
    } catch (Exception exception) {
      throw new LicensingException("Unable to create license", exception);
    } 
    LicenseKey licenseKey = (LicenseKey)this.cgs.get();
    licenseKey.populateFromLicenseContent(paramLicenseKeyRequest.getLicenseContent());
    return licenseKey;
  }
  
  public LicenseKey installLicense(LicenseParam paramLicenseParam, File paramFile) throws LicensingException {
    LicenseKey licenseKey;
    try {
      licenseKey = (LicenseKey)this.cgs.get();
      CustomLicenseContent customLicenseContent = (CustomLicenseContent)(new aec(paramLicenseParam, this.wst)).itm(paramFile);
      licenseKey.populateFromLicenseContent(customLicenseContent);
    } catch (LicenseContentException licenseContentException) {
      throw new LicensingException(itm(licenseContentException), licenseContentException);
    } catch (Exception exception) {
      throw new LicensingException("Unable to install license: " + itm(exception), exception);
    } 
    return licenseKey;
  }
  
  public void uninstallLicense(LicenseParam paramLicenseParam) throws LicensingException {
    try {
      (new aec(paramLicenseParam, this.wst)).bao();
    } catch (LicenseContentException licenseContentException) {
      throw new LicensingException(itm(licenseContentException), licenseContentException);
    } catch (Exception exception) {
      throw new LicensingException("Unable to uninstall license: " + itm(exception), exception);
    } 
  }
  
  public LicenseKey verifyLicense(LicenseParam paramLicenseParam) throws LicensingException {
    LicenseKey licenseKey = (LicenseKey)this.cgs.get();
    try {
      CustomLicenseContent customLicenseContent = (CustomLicenseContent)(new aec(paramLicenseParam, this.wst)).mif();
      licenseKey.populateFromLicenseContent(customLicenseContent);
    } catch (LicenseContentException licenseContentException) {
      throw new LicensingException(itm(licenseContentException), licenseContentException);
    } catch (Exception exception) {
      throw new LicensingException("Unable to verify license", exception);
    }

    return licenseKey;
  }
  
  public LicenseKey verifyLicense(LicenseParam paramLicenseParam, File paramFile) throws LicensingException {
    LicenseKey licenseKey = (LicenseKey)this.cgs.get();
    try {
      CustomLicenseContent customLicenseContent = (new aec(paramLicenseParam, this.wst)).rkn(paramFile);
      licenseKey.populateFromLicenseContent(customLicenseContent);
    } catch (LicenseContentException licenseContentException) {
      throw new LicensingException(itm(licenseContentException), licenseContentException);
    } catch (Exception exception) {
      throw new LicensingException("Unable to verify license", exception);
    } 
    return licenseKey;
  }
  
  public void validateFeature(LicenseKey paramLicenseKey, Feature paramFeature) throws LicensingException {
    this.fmh.validate(paramFeature, paramLicenseKey);
  }
  
  private String itm(Exception paramException) {
    return (paramException.getLocalizedMessage() != null) ? paramException.getLocalizedMessage() : paramException.getMessage();
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\internal\DefaultLicenseManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */