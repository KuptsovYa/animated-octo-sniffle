package org.sonatype.licensing.product.internal;

import com.google.common.base.Preconditions;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import org.codehaus.plexus.util.FileUtils;
import org.codehaus.plexus.util.io.InputStreamFacade;
import org.codehaus.plexus.util.io.RawInputStreamFacade;
import org.sonatype.licensing.LicenseKey;
import org.sonatype.licensing.LicensingException;
import org.sonatype.licensing.feature.Feature;
import org.sonatype.licensing.product.LicenseBuilder;
import org.sonatype.licensing.product.LicenseChangeNotifier;
import org.sonatype.licensing.product.ProductLicenseKey;
import org.sonatype.licensing.product.ProductLicenseManager;
import org.sonatype.licensing.trial.TrialLicenseManager;
import org.sonatype.licensing.trial.TrialLicenseParam;

//@Named("licensing.default")
@Singleton
public class DefaultProductLicenseManager implements ProductLicenseManager {
  private final TrialLicenseManager aff;
  
  private final LicenseBuilder zuc;
  
  private final LicenseChangeNotifier wnl;
  
  @Inject
  public DefaultProductLicenseManager(TrialLicenseManager paramTrialLicenseManager, LicenseBuilder paramLicenseBuilder, LicenseChangeNotifier paramLicenseChangeNotifier) {
    this.aff = paramTrialLicenseManager;
    this.zuc = paramLicenseBuilder;
    this.wnl = (LicenseChangeNotifier)Preconditions.checkNotNull(paramLicenseChangeNotifier);
  }
  
  public ProductLicenseKey getLicenseDetails() throws LicensingException {
    LicenseKey licenseKey = this.aff.verifyLicense(this.zuc.buildPublicParam());
    return itm(licenseKey);
  }
  
  private ProductLicenseKey itm(LicenseKey paramLicenseKey) throws LicensingException {
    if (paramLicenseKey instanceof ProductLicenseKey)
      return (ProductLicenseKey)paramLicenseKey; 
    if (paramLicenseKey == null)
      return null; 
    throw new LicensingException("Key implementation is not a ProductLicenseKey: " + paramLicenseKey.getClass());
  }
  
  public ProductLicenseKey getLicenseDetails(InputStream paramInputStream) throws LicensingException, IOException {
    File file = null;
    try {
      file = File.createTempFile("license-", ".lic");
      FileUtils.copyStreamToFile((InputStreamFacade)new RawInputStreamFacade(paramInputStream), file);
      LicenseKey licenseKey = this.aff.verifyLicense(this.zuc.buildPublicParam(), file);
      return itm(licenseKey);
    } finally {
      if (file != null)
        file.delete(); 
    } 
  }
  
  private void itm(ProductLicenseKey paramProductLicenseKey, boolean paramBoolean) {
    this.wnl.notifyListeners(paramProductLicenseKey, paramBoolean, null);
  }
  
  public void installLicense(InputStream paramInputStream) throws IOException, LicensingException {
    File file = null;
    try {
      file = File.createTempFile("license-", ".lic");
      FileUtils.copyStreamToFile((InputStreamFacade)new RawInputStreamFacade(paramInputStream), file);
      TrialLicenseParam trialLicenseParam = this.zuc.buildPublicParam();
      ProductLicenseKey productLicenseKey = itm(file, trialLicenseParam);
      itm(productLicenseKey, true);
    } catch (LicensingException licensingException) {
      itm(itm(licensingException.getKey()), false);
      throw licensingException;
    } finally {
      if (file != null)
        file.delete(); 
    } 
  }
  
  private synchronized ProductLicenseKey itm(File paramFile, TrialLicenseParam paramTrialLicenseParam) throws LicensingException {
    return itm(this.aff.installLicense(paramTrialLicenseParam, paramFile));
  }
  
  public void uninstallLicense() throws LicensingException {
    mpl();
    itm((ProductLicenseKey)null, false);
  }
  
  private synchronized void mpl() throws LicensingException {
    this.aff.uninstallLicense(this.zuc.buildPublicParam());
  }
  
  public void verifyLicenseAndFeature(Feature paramFeature) throws LicensingException {
    verifyFeature(itm(this.aff.verifyLicense(this.zuc.buildPublicParam())), paramFeature);
  }
  
  public void verifyFeature(ProductLicenseKey paramProductLicenseKey, Feature paramFeature) throws LicensingException {
    this.aff.validateFeature((LicenseKey)paramProductLicenseKey, paramFeature);
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\internal\DefaultProductLicenseManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */