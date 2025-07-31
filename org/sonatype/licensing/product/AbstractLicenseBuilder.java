package org.sonatype.licensing.product;

import codeguard.licensing.Obfuscator;
import org.sonatype.licensing.CustomLicenseContent;
import org.sonatype.licensing.LicensingException;
import org.sonatype.licensing.PreferencesFactory;
import org.sonatype.licensing.ProductDetails;
import org.sonatype.licensing.internal.DefaultKeyStoreParam;
import org.sonatype.licensing.trial.TrialLicenseParam;
import org.sonatype.licensing.trial.TrialParam;
import org.sonatype.licensing.util.LicensingUtil;

public abstract class AbstractLicenseBuilder implements LicenseBuilder {
  private static final String rfk = (new Obfuscator(new long[] { -1690058102093644793L, 3975167369736229458L, 6881864084162147984L })).toString();
  
  private static final String ohr = (new Obfuscator(new long[] { 348214743486407250L, -5665724013535777408L, 5783893877095155298L, -9222320762758361454L, 6192500194308087316L, 3477852850060463659L, 7694194449945358034L, -362616691434936395L, -8857163466429480282L })).toString();
  
  private final ProductDetails xrw;
  
  private final TrialParam uho;
  
  private final String gyh;
  
  private final PreferencesFactory xpt;
  
  public AbstractLicenseBuilder(ProductDetails paramProductDetails, TrialParam paramTrialParam, String paramString, PreferencesFactory paramPreferencesFactory) {
    this.xrw = paramProductDetails;
    if (paramTrialParam == null) {
      this.uho = new itm();
    } else {
      this.uho = paramTrialParam;
    } 
    if (paramString == null) {
      this.gyh = LicensingUtil.getPackage(paramProductDetails.getProductName());
    } else {
      this.gyh = paramString;
    } 
    this.xpt = paramPreferencesFactory;
  }
  
  public AbstractLicenseBuilder(ProductDetails paramProductDetails, TrialParam paramTrialParam, PreferencesFactory paramPreferencesFactory) {
    this(paramProductDetails, paramTrialParam, (String)null, paramPreferencesFactory);
  }
  
  public AbstractLicenseBuilder(ProductDetails paramProductDetails, PreferencesFactory paramPreferencesFactory) {
    this(paramProductDetails, (TrialParam)null, (String)null, paramPreferencesFactory);
  }
  
  public AbstractLicenseBuilder(ProductDetails paramProductDetails, String paramString, PreferencesFactory paramPreferencesFactory) {
    this(paramProductDetails, (TrialParam)null, paramString, paramPreferencesFactory);
    if (getClass().getResource(getPublicKeyStorePath()) == null)
      throw new IllegalArgumentException("Could not find public key store resource"); 
    if (getClass().getResource(getTrialKeyStorePath()) == null)
      throw new IllegalArgumentException("Could not find trial key store resource"); 
  }
  
  public TrialLicenseParam buildPublicParam() throws LicensingException {
    DefaultKeyStoreParam defaultKeyStoreParam1 = new DefaultKeyStoreParam(getClass(), getPublicKeyStorePath(), getPublicKeyStoreAlias(), getPublicKeyStorePassword(), null);
    DefaultKeyStoreParam defaultKeyStoreParam2 = new DefaultKeyStoreParam(getClass(), getTrialKeyStorePath(), getTrialKeyStoreAlias(), getTrialKeyStorePassword(), getTrialKeyStorePassword());
    return new TrialLicenseParam(this.xrw.getProductName(), this.xpt.nodeForPath(this.gyh), defaultKeyStoreParam1, defaultKeyStoreParam2, this.uho);
  }
  
  public String getPreferenceNodePath() {
    return this.gyh;
  }
  
  public String getPublicKeyStoreAlias() {
    return this.xrw.getProductName();
  }
  
  public String getTrialKeyStorePassword() {
    return rfk;
  }
  
  public String getTrialKeyStoreAlias() {
    return rfk;
  }
  
  public String getTrialKeyStorePath() {
    return ohr;
  }
  
  static class itm implements TrialParam {
    private itm() {}
    
    public boolean isEligibleForTrial() {
      return false;
    }
    
    public void removeTrialEligibility() {}
    
    public int getDaysForTrial() {
      return 1;
    }
    
    public CustomLicenseContent createTrialLicenseContent() {
      throw new UnsupportedOperationException("This trial parameter is never eligible for trial licensing.");
    }
    
    public void trialGranted(CustomLicenseContent param1CustomLicenseContent) {
      throw new UnsupportedOperationException("This trial parameter is never eligible for trial licensing.");
    }
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\AbstractLicenseBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */