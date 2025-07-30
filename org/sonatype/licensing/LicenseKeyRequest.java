package org.sonatype.licensing;

import java.io.File;
import javax.security.auth.x500.X500Principal;

public interface LicenseKeyRequest extends License {
  void setLicenseKeyFile(File paramFile);
  
  File getLicenseKeyFile();
  
  CustomLicenseContent getLicenseContent();
  
  X500Principal getIssuer();
  
  String getExtraContent();
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\LicenseKeyRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */