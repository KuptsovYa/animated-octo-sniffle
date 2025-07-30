package org.sonatype.licensing.product;

import java.io.IOException;
import java.io.InputStream;
import org.sonatype.licensing.LicensingException;
import org.sonatype.licensing.feature.Feature;

public interface ProductLicenseManager {
  void installLicense(InputStream paramInputStream) throws IOException, LicensingException;
  
  void uninstallLicense() throws LicensingException;
  
  ProductLicenseKey getLicenseDetails() throws LicensingException;
  
  ProductLicenseKey getLicenseDetails(InputStream paramInputStream) throws IOException, LicensingException;
  
  void verifyLicenseAndFeature(Feature paramFeature) throws LicensingException;
  
  void verifyFeature(ProductLicenseKey paramProductLicenseKey, Feature paramFeature) throws LicensingException;
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\ProductLicenseManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */