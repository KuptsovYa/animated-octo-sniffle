package org.sonatype.licensing.product.internal;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import org.codehaus.plexus.util.StringUtils;
import org.codehaus.plexus.util.xml.pull.MXParser;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonatype.licensing.AbstractLicenseKey;
import org.sonatype.licensing.LicenseKey;
import org.sonatype.licensing.feature.Feature;
import org.sonatype.licensing.feature.Features;
import org.sonatype.licensing.product.ProductLicenseKey;
import org.sonatype.licensing.product.SslKeyContainer;

@Named("licensing.default")
public class DefaultLicenseKey extends AbstractLicenseKey implements LicenseKey, ProductLicenseKey {
  private final Logger fjz = LoggerFactory.getLogger(DefaultLicenseKey.class);
  
  private boolean ymv;
  
  private int bzn = -1;
  
  private final List<SslKeyContainer> fvf = new LinkedList<SslKeyContainer>();
  
  private final Set<String> zpu = new HashSet<String>();
  
  private Properties kxn = new Properties();
  
  @Inject
  public DefaultLicenseKey(Features paramFeatures) {
    super(paramFeatures);
  }
  
  public boolean isFreeLicense() {
    return this.ymv;
  }
  
  private void setFreeLicense(boolean paramBoolean) {
    this.ymv = paramBoolean;
  }
  
  public int getLicensedUsers() {
    return this.bzn;
  }
  
  private void setLicensedUsers(int paramInt) {
    this.bzn = paramInt;
  }
  
  public void parseExtraContent(String paramString) {
    MXParser mXParser = new MXParser();
    try {
      mXParser.setInput(new StringReader(paramString));
      int i = mXParser.getEventType();
      boolean bool1 = false;
      boolean bool2 = false;
      boolean bool3 = false;
      boolean bool4 = false;
      boolean bool5 = false;
      boolean bool6 = false;
      boolean bool7 = false;
      boolean bool8 = false;
      boolean bool9 = false;
      String str1 = null;
      String str2 = null;
      SslKeyContainer.Type type = null;
      String str3 = null;
      String str4 = null;
      while (i != 1) {
        if (i == 2) {
          if (mXParser.getName().equals("nexusLicenseContent") || mXParser.getName().equals("licenseContent")) {
            bool1 = true;
          } else if (bool1 && mXParser.getName().equals("freeLicense")) {
            setFreeLicense(Boolean.valueOf(StringUtils.trim(mXParser.nextText())).booleanValue());
          } else if (bool1 && mXParser.getName().equals("licensedUsers")) {
            setLicensedUsers(Integer.valueOf(StringUtils.trim(mXParser.nextText())).intValue());
          } else if (bool1 && mXParser.getName().equals("evaluation")) {
            setEvaluation(Boolean.valueOf(StringUtils.trim(mXParser.nextText())).booleanValue());
          } else if (bool1 && mXParser.getName().equals("features")) {
            bool2 = true;
          } else if (bool2 && mXParser.getName().equals("feature")) {
            bool3 = true;
          } else if (bool3 && mXParser.getName().equals("id")) {
            String str = StringUtils.trim(mXParser.nextText());
            Feature feature = (Feature)getAvailableFeatures().get(str);
            getRawFeatures().add(str);
            if (feature != null) {
              getFeatureSet().addFeature(feature);
            } else {
              this.fjz.debug("Invalid feature: {} found in license key, ignoring.", str);
            } 
          } else if (bool1 && mXParser.getName().equals("keys")) {
            bool4 = true;
          } else if (bool4 && mXParser.getName().equals("key")) {
            bool5 = true;
          } else if (bool5 && mXParser.getName().equals("entry")) {
            str1 = mXParser.nextText();
          } else if (bool5 && mXParser.getName().equals("password")) {
            str2 = mXParser.nextText();
          } else if (bool5 && mXParser.getName().equals("type")) {
            String str = mXParser.nextText();
            try {
              type = SslKeyContainer.Type.valueOf(str);
            } catch (IllegalArgumentException illegalArgumentException) {
              throw new XmlPullParserException("Unknown key type: " + str, mXParser, illegalArgumentException);
            } 
          } else if (mXParser.getName().equals("products")) {
            bool6 = true;
          } else if (bool6 && mXParser.getName().equals("product")) {
            bool7 = true;
          } else if (bool7 && mXParser.getName().equals("id")) {
            this.zpu.add(mXParser.nextText().toLowerCase(Locale.US));
          } else if (mXParser.getName().equals("properties")) {
            bool8 = true;
          } else if (mXParser.getName().equals("property")) {
            bool9 = true;
          } else if (bool9 && mXParser.getName().equals("key")) {
            str3 = StringUtils.trim(mXParser.nextText());
          } else if (bool9 && mXParser.getName().equals("value")) {
            str4 = StringUtils.trim(mXParser.nextText());
          } else if (!bool1) {
            throw new XmlPullParserException("Illegal tag: '" + mXParser.getName() + "'", mXParser, null);
          } 
          if (str1 != null && str2 != null && type != null) {
            itm(new GenericSslKeyContainer(str1, str2, type));
            str1 = null;
            str2 = null;
            type = null;
          } else if (str3 != null && str4 != null) {
            getProperties().put(str3, str4);
            str3 = null;
            str4 = null;
          } 
        } else if (i == 3) {
          if (mXParser.getName().equals("nexusLicenseContent") || mXParser.getName().equals("licenseContent")) {
            bool1 = false;
          } else if (bool1 && mXParser.getName().equals("features")) {
            bool2 = false;
          } else if (bool2 && mXParser.getName().equals("feature")) {
            bool3 = false;
          } else if (bool5 && mXParser.getName().equals("key")) {
            bool5 = false;
          } else if (bool4 && mXParser.getName().equals("keys")) {
            bool4 = false;
          } else if (bool6 && mXParser.getName().equals("products")) {
            bool6 = false;
          } else if (bool7 && mXParser.getName().equals("product")) {
            bool7 = false;
          } else if (bool8 && mXParser.getName().equals("properties")) {
            bool8 = false;
          } else if (bool9 && mXParser.getName().equals("property")) {
            bool9 = false;
          } 
        } 
        i = mXParser.next();
      } 
    } catch (XmlPullParserException xmlPullParserException) {
      this.fjz.error("Unable to properly read license content", (Throwable)xmlPullParserException);
    } catch (IOException iOException) {
      this.fjz.error("Unable to properly read license content", iOException);
    } 
  }
  
  private void itm(SslKeyContainer paramSslKeyContainer) {
    this.fvf.add(paramSslKeyContainer);
  }
  
  public List<SslKeyContainer> getSslKeys() {
    return this.fvf;
  }
  
  public boolean isProductLicensed(String paramString) {
    return this.zpu.contains(paramString);
  }
  
  public void setProperties(Properties paramProperties) {
    this.kxn = paramProperties;
  }
  
  public Properties getProperties() {
    return this.kxn;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\internal\DefaultLicenseKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */