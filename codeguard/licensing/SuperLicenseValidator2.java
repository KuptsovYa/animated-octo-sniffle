package codeguard.licensing;

import de.schlichtherle.license.LicenseContent;
import de.schlichtherle.license.LicenseContentException;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import org.sonatype.licensing.CustomLicenseContent;
import org.sonatype.licensing.LicenseValidator;
import org.sonatype.licensing.product.internal.DefaultLicenseKey;

@Named("licensing.default")
public class SuperLicenseValidator2 extends LicenseValidator1 implements LicenseValidator {
  private static final String xlf = (new Obfuscator(new long[] { -9211605111142713620L, 391714365510707393L, -7356761750428556372L, 6379560902598103028L })).toString();
  
  private final Provider<DefaultLicenseKey> defaultLicenseKeyProvider;
  
  @Inject
  public SuperLicenseValidator2(Provider<DefaultLicenseKey> paramProvider) {
    this.defaultLicenseKeyProvider = paramProvider;
  }
  
  protected void itm(LicenseContent paramLicenseContent, String paramString1, String paramString2) throws LicenseContentException {
    if (paramString1 == null || (!paramString1.contains(paramString2) && !itm(paramLicenseContent, paramString2)))
      throw new LicenseContentException(xlf); 
  }
  
  private boolean itm(LicenseContent paramLicenseContent, String paramString) {
    if (!(paramLicenseContent instanceof CustomLicenseContent))
      return false; 
    CustomLicenseContent customLicenseContent = (CustomLicenseContent)paramLicenseContent;
    DefaultLicenseKey defaultLicenseKey = (DefaultLicenseKey)this.defaultLicenseKeyProvider.get();
    defaultLicenseKey.populateFromLicenseContent(customLicenseContent);
    return defaultLicenseKey.isProductLicensed(paramString);
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\djy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */