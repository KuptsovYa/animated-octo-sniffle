package org.sonatype.licensing.product;

import java.util.List;
import java.util.Properties;
import org.sonatype.licensing.LicenseKey;

public interface ProductLicenseKey extends LicenseKey {
  List<SslKeyContainer> getSslKeys();
  
  int getLicensedUsers();
  
  boolean isFreeLicense();
  
  void setProperties(Properties paramProperties);
  
  Properties getProperties();
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\ProductLicenseKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */