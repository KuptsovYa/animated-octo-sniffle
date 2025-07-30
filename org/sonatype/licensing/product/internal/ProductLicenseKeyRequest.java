package org.sonatype.licensing.product.internal;

import java.util.Collection;
import java.util.List;
import java.util.Properties;
import org.sonatype.licensing.LicenseKeyRequest;
import org.sonatype.licensing.product.SslKeyContainer;

public interface ProductLicenseKeyRequest extends LicenseKeyRequest {
  boolean isFreeLicense();
  
  void setFreeLicense(boolean paramBoolean);
  
  int getLicensedUsers();
  
  void setLicensedUsers(int paramInt);
  
  List<SslKeyContainer> getKeys();
  
  void setKeys(SslKeyContainer[] paramArrayOfSslKeyContainer);
  
  void setLicensedProducts(Collection<String> paramCollection);
  
  Collection<String> getLicensedProducts();
  
  void setProperties(Properties paramProperties);
  
  Properties getProperties();
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\internal\ProductLicenseKeyRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */