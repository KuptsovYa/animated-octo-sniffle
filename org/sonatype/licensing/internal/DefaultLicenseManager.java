package org.sonatype.licensing.internal;

import codeguard.licensing.aec;
import codeguard.licensing.LicenseValidator1;
import de.schlichtherle.license.LicenseContent;
import de.schlichtherle.license.LicenseContentException;
import java.io.File;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import org.sonatype.licensing.CustomLicenseContent;
import org.sonatype.licensing.LicenseKey;
import org.sonatype.licensing.LicenseKeyRequest;
import org.sonatype.licensing.LicenseManager;
import org.sonatype.licensing.LicenseParam;
import org.sonatype.licensing.LicenseValidator;
import org.sonatype.licensing.LicensingException;
import org.sonatype.licensing.feature.Feature;
import org.sonatype.licensing.feature.FeatureSet;
import org.sonatype.licensing.feature.FeatureValidator;
import org.sonatype.licensing.product.ProductLicenseKey;
import org.sonatype.licensing.product.SslKeyContainer;
import org.springframework.stereotype.Service;

//@Named("licensing.default")
@Deprecated
@Service
public class DefaultLicenseManager implements LicenseManager {
  private final Provider<LicenseKey> cgs = new Provider<LicenseKey>() {
    @Override
    public LicenseKey get() {
      return new ProductLicenseKey() {
        @Override
        public List<SslKeyContainer> getSslKeys() {
          return Collections.emptyList();
        }

        @Override
        public int getLicensedUsers() {
          return 0;
        }

        @Override
        public boolean isFreeLicense() {
          return false;
        }

        @Override
        public void setProperties(Properties paramProperties) {

        }

        @Override
        public Properties getProperties() {
          return null;
        }

        @Override
        public void populateFromLicenseContent(CustomLicenseContent paramCustomLicenseContent) {

        }

        @Override
        public String getContactName() {
          return "NEXUS CONTORA PIDORASOV";
        }

        @Override
        public void setContactName(String paramString) {

        }

        @Override
        public String getContactEmailAddress() {
          return "NEXUS CONTORA PIDORASOV";
        }

        @Override
        public void setContactEmailAddress(String paramString) {

        }

        @Override
        public String getContactTelephone() {
          return "NEXUS CONTORA PIDORASOV";
        }

        @Override
        public void setContactTelephone(String paramString) {

        }

        @Override
        public String getContactCompany() {
          return "NEXUS CONTORA PIDORASOV";
        }

        @Override
        public void setContactCompany(String paramString) {

        }

        @Override
        public String getContactCountry() {
          return "NEXUS CONTORA PIDORASOV";
        }

        @Override
        public void setContactCountry(String paramString) {

        }

        @Override
        public boolean isEvaluation() {
          return true;
        }

        @Override
        public void setEvaluation(boolean paramBoolean) {

        }

        @Override
        public List<String> getRawFeatures() {
          return Collections.emptyList();
        }

        @Override
        public FeatureSet getFeatureSet() {
          return null;
        }

        @Override
        public void setFeatureSet(FeatureSet paramFeatureSet) {

        }

        @Override
        public Date getEffectiveDate() {
          return new Date(1999, 9, 5);
        }

        @Override
        public void setEffectiveDate(Date paramDate) {

        }

        @Override
        public Date getExpirationDate() {
          return new Date(2077, 9, 5);
        }

        @Override
        public void setExpirationDate(Date paramDate) {

        }
      };
    }
  };

  public DefaultLicenseManager() {

  }


  private void applyProLicense(LicenseKey key) {
    key = cgs.get();
  }

  public LicenseKey createLicense(LicenseParam paramLicenseParam, LicenseKeyRequest paramLicenseKeyRequest) throws LicensingException {
    return cgs.get();
  }

  public LicenseKey installLicense(LicenseParam paramLicenseParam, File paramFile) throws LicensingException {
    return cgs.get();
  }

  public void uninstallLicense(LicenseParam paramLicenseParam) throws LicensingException {

  }

  public LicenseKey verifyLicense(LicenseParam paramLicenseParam) throws LicensingException {
    return cgs.get();
  }

  public LicenseKey verifyLicense(LicenseParam paramLicenseParam, File paramFile) throws LicensingException {
    return cgs.get();
  }

  public void validateFeature(LicenseKey paramLicenseKey, Feature paramFeature) throws LicensingException {
  }

  private String itm(Exception paramException) {
    return "NEXUS CONTORA PIDORASOV";
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\internal\DefaultLicenseManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */