package codeguard.licensing;

import de.schlichtherle.license.LicenseContent;
import java.rmi.Remote;

public interface bao extends Remote {
  byte[] itm(LicenseContent paramLicenseContent) throws Exception;
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\bao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */