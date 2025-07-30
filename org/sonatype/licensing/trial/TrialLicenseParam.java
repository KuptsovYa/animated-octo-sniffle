package org.sonatype.licensing.trial;

import codeguard.licensing.chr;
import codeguard.licensing.eui;
import codeguard.licensing.omj;
import codeguard.licensing.zxn;
import de.schlichtherle.license.LicenseContent;
import java.util.prefs.Preferences;
import org.sonatype.licensing.CustomLicenseContent;
import org.sonatype.licensing.internal.DefaultKeyStoreParam;

public final class TrialLicenseParam implements chr {
  private final String eui;
  
  private final Preferences mif;
  
  private final DefaultKeyStoreParam miu;
  
  private final omj bab;
  
  private final DefaultKeyStoreParam uwe;
  
  private final TrialParam uho;
  
  public TrialLicenseParam(String paramString, Preferences paramPreferences, DefaultKeyStoreParam paramDefaultKeyStoreParam1, DefaultKeyStoreParam paramDefaultKeyStoreParam2, TrialParam paramTrialParam) {
    this.eui = paramString;
    this.mif = paramPreferences;
    this.miu = paramDefaultKeyStoreParam1;
    this.bab = (omj)new zxn((paramDefaultKeyStoreParam1.getStorePwd() != null) ? paramDefaultKeyStoreParam1.getStorePwd() : paramDefaultKeyStoreParam1.getKeyPwd());
    this.uwe = paramDefaultKeyStoreParam2;
    this.uho = paramTrialParam;
  }
  
  public omj getCipherParam() {
    return this.bab;
  }
  
  public eui getKeyStoreParam() {
    return (eui)this.miu;
  }
  
  public Preferences getPreferences() {
    return this.mif;
  }
  
  public String getSubject() {
    return this.eui;
  }
  
  public LicenseContent createFTPLicenseContent() {
    return (LicenseContent)this.uho.createTrialLicenseContent();
  }
  
  public void ftpGranted(LicenseContent paramLicenseContent) {
    CustomLicenseContent customLicenseContent = null;
    if (paramLicenseContent instanceof CustomLicenseContent) {
      customLicenseContent = (CustomLicenseContent)paramLicenseContent;
    } else {
      customLicenseContent = new CustomLicenseContent(paramLicenseContent);
    } 
    this.uho.trialGranted(customLicenseContent);
  }
  
  public int getFTPDays() {
    return this.uho.getDaysForTrial();
  }
  
  public eui getFTPKeyStoreParam() {
    return (eui)this.uwe;
  }
  
  public boolean isFTPEligible() {
    return this.uho.isEligibleForTrial();
  }
  
  public void removeFTPEligibility() {
    this.uho.removeTrialEligibility();
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\trial\TrialLicenseParam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */