package codeguard.licensing;

import com.google.common.collect.Lists;
import java.util.Date;
import java.util.List;
import org.sonatype.licensing.License;
import org.sonatype.licensing.feature.FeatureSet;

public abstract class rnn implements License {
  private String syx;
  
  private String zkh;
  
  private String irg;
  
  private String jrn;
  
  private String sxl;
  
  private Date sqr;
  
  private Date nqm;
  
  private boolean zeb;
  
  private FeatureSet llc = new FeatureSet();
  
  private List<String> aaz = Lists.newArrayList();
  
  public String getContactCompany() {
    return this.syx;
  }
  
  public String getContactCountry() {
    return this.zkh;
  }
  
  public String getContactEmailAddress() {
    return this.irg;
  }
  
  public String getContactName() {
    return this.jrn;
  }
  
  public String getContactTelephone() {
    return this.sxl;
  }
  
  public Date getEffectiveDate() {
    return this.sqr;
  }
  
  public Date getExpirationDate() {
    return this.nqm;
  }
  
  public boolean isEvaluation() {
    return this.zeb;
  }
  
  public FeatureSet getFeatureSet() {
    return this.llc;
  }
  
  public List<String> getRawFeatures() {
    return this.aaz;
  }
  
  public void setContactCompany(String paramString) {
    this.syx = paramString;
  }
  
  public void setContactCountry(String paramString) {
    this.zkh = paramString;
  }
  
  public void setContactEmailAddress(String paramString) {
    this.irg = paramString;
  }
  
  public void setContactName(String paramString) {
    this.jrn = paramString;
  }
  
  public void setContactTelephone(String paramString) {
    this.sxl = paramString;
  }
  
  public void setEvaluation(boolean paramBoolean) {
    this.zeb = paramBoolean;
  }
  
  public void setEffectiveDate(Date paramDate) {
    this.sqr = paramDate;
  }
  
  public void setExpirationDate(Date paramDate) {
    this.nqm = paramDate;
  }
  
  public void setFeatureSet(FeatureSet paramFeatureSet) {
    this.llc = paramFeatureSet;
  }
  
  public void setRawFeatures(List<String> paramList) {
    this.aaz = paramList;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\rnn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */