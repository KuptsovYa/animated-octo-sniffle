package org.sonatype.licensing;

import java.util.Date;
import java.util.List;
import org.sonatype.licensing.feature.FeatureSet;

public interface License {
  String getContactName();
  
  void setContactName(String paramString);
  
  String getContactEmailAddress();
  
  void setContactEmailAddress(String paramString);
  
  String getContactTelephone();
  
  void setContactTelephone(String paramString);
  
  String getContactCompany();
  
  void setContactCompany(String paramString);
  
  String getContactCountry();
  
  void setContactCountry(String paramString);
  
  boolean isEvaluation();
  
  void setEvaluation(boolean paramBoolean);
  
  List<String> getRawFeatures();
  
  FeatureSet getFeatureSet();
  
  void setFeatureSet(FeatureSet paramFeatureSet);
  
  Date getEffectiveDate();
  
  void setEffectiveDate(Date paramDate);
  
  Date getExpirationDate();
  
  void setExpirationDate(Date paramDate);
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\License.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */