package org.sonatype.licensing.product.util;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import org.apache.commons.codec.binary.Base64;
import org.sonatype.licensing.LicenseKey;
import org.sonatype.licensing.LicensingException;
import org.sonatype.licensing.PreferencesFactory;
import org.sonatype.licensing.product.LicenseBuilder;
import org.sonatype.licensing.product.ProductLicenseKey;
import org.sonatype.licensing.product.ProductLicenseManager;

@Named
@Singleton
public class LicenseContent {
  private final ProductLicenseManager sua;

//  private final String qbc;

  private final PreferencesFactory xpt;

  @Inject
  public LicenseContent(
//          LicenseBuilder paramLicenseBuilder,
          ProductLicenseManager paramProductLicenseManager,
          PreferencesFactory paramPreferencesFactory) {
    this.sua = paramProductLicenseManager;
//    this.qbc = paramLicenseBuilder.getPreferenceNodePath();
    this.xpt = paramPreferencesFactory;
  }

//  public byte[] raw() {
//    return Base64.decodeBase64(this.xpt.nodeForPath(this.qbc).get("license", null));
//  }

  public ProductLicenseKey key() {
    try {
      return this.sua.getLicenseDetails();
    } catch (LicensingException licensingException) {
      LicenseKey licenseKey = licensingException.getKey();
      return !(licenseKey instanceof ProductLicenseKey) ? null : (ProductLicenseKey)licenseKey;
    }
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\produc\\util\LicenseContent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */