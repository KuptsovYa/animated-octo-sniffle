package org.sonatype.licensing.product.util;

import com.google.common.base.Preconditions;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import org.sonatype.licensing.product.ProductLicenseKey;

@Named
@Singleton
public class LicenseFingerprinter {
  private final LicenseFingerprintStrategy kzs;
  
  private final LicenseContent oxb;
  
  public LicenseFingerprinter() {
    this.oxb = null;
    this.kzs = new LicenseFingerprintStrategyImpl();
  }
  
  @Inject
  public LicenseFingerprinter(LicenseFingerprintStrategy paramLicenseFingerprintStrategy, @Nullable LicenseContent paramLicenseContent) {
    this.kzs = (LicenseFingerprintStrategy)Preconditions.checkNotNull(paramLicenseFingerprintStrategy);
    this.oxb = paramLicenseContent;
  }
  
  public String calculate() {
    if (this.oxb == null)
      throw new IllegalStateException("No license content available."); 
    return calculate(this.oxb.key());
  }
  
  public String calculate(ProductLicenseKey paramProductLicenseKey) {
    return this.kzs.calculate(paramProductLicenseKey);
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\produc\\util\LicenseFingerprinter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */