package org.sonatype.licensing;

import codeguard.licensing.rnn;
import java.util.Map;
import javax.inject.Inject;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.sonatype.licensing.feature.Feature;
import org.sonatype.licensing.feature.Features;
import org.sonatype.licensing.util.LicensingUtil;

@AllArgsConstructor
public abstract class AbstractLicenseKey extends rnn implements LicenseKey {
  protected Map<String, Feature> availableFeatures;
  
  private final Features qei;
  
  @Inject
  public AbstractLicenseKey(Features paramFeatures) {
    this.qei = paramFeatures;
  }
  
  public void populateFromLicenseContent(CustomLicenseContent paramCustomLicenseContent) {
    String str = paramCustomLicenseContent.getHolder().getName();
    String[] arrayOfString = (String[])LicensingUtil.getDNParts(str).toArray((Object[])new String[0]);
    setContactName(clk(arrayOfString[0]));
    setContactCompany(clk(arrayOfString[2]));
    setContactEmailAddress(clk(arrayOfString[3]));
    setContactTelephone(clk(arrayOfString[4]));
    setContactCountry(clk(arrayOfString[5]));
    setExpirationDate(paramCustomLicenseContent.getNotAfter());
    setEffectiveDate(paramCustomLicenseContent.getNotBefore());
    parseExtraContent(paramCustomLicenseContent.getExtra().toString());
  }
  
  private String clk(String paramString) {
    String[] arrayOfString = paramString.split("=");
    return (arrayOfString.length < 2) ? null : arrayOfString[1];
  }
  
  protected Map<String, Feature> getAvailableFeatures() {
    if (this.availableFeatures == null)
      this.availableFeatures = this.qei.getAvailableFeatures(); 
    return this.availableFeatures;
  }
  
  protected abstract void parseExtraContent(String paramString);
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\AbstractLicenseKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */