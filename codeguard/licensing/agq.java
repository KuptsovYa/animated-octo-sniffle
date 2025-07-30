package codeguard.licensing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class agq implements Serializable {
  private String gae;
  
  private boolean ymv = false;
  
  private int bzn = -1;
  
  private boolean zeb = false;
  
  private List<bjw> aab;
  
  private List<whz> dlc;
  
  private List<haa> fvf;
  
  private List<aua> bko;
  
  private String ifu = "UTF-8";
  
  public static final String wzy = "1.0.2";
  
  public void itm(whz paramwhz) {
    zhj().add(paramwhz);
  }
  
  public void itm(haa paramhaa) {
    getKeys().add(paramhaa);
  }
  
  public void itm(bjw parambjw) {
    bos().add(parambjw);
  }
  
  public void itm(aua paramaua) {
    zsv().add(paramaua);
  }
  
  public List<whz> zhj() {
    if (this.dlc == null)
      this.dlc = new ArrayList<whz>(); 
    return this.dlc;
  }
  
  public List<haa> getKeys() {
    if (this.fvf == null)
      this.fvf = new ArrayList<haa>(); 
    return this.fvf;
  }
  
  public int getLicensedUsers() {
    return this.bzn;
  }
  
  public String rnn() {
    return this.ifu;
  }
  
  public List<bjw> bos() {
    if (this.aab == null)
      this.aab = new ArrayList<bjw>(); 
    return this.aab;
  }
  
  public List<aua> zsv() {
    if (this.bko == null)
      this.bko = new ArrayList<aua>(); 
    return this.bko;
  }
  
  public String aec() {
    return this.gae;
  }
  
  public boolean isEvaluation() {
    return this.zeb;
  }
  
  public boolean isFreeLicense() {
    return this.ymv;
  }
  
  public void omj(whz paramwhz) {
    zhj().remove(paramwhz);
  }
  
  public void omj(haa paramhaa) {
    getKeys().remove(paramhaa);
  }
  
  public void omj(bjw parambjw) {
    bos().remove(parambjw);
  }
  
  public void omj(aua paramaua) {
    zsv().remove(paramaua);
  }
  
  public void setEvaluation(boolean paramBoolean) {
    this.zeb = paramBoolean;
  }
  
  public void itm(List<whz> paramList) {
    this.dlc = paramList;
  }
  
  public void setFreeLicense(boolean paramBoolean) {
    this.ymv = paramBoolean;
  }
  
  public void omj(List<haa> paramList) {
    this.fvf = paramList;
  }
  
  public void setLicensedUsers(int paramInt) {
    this.bzn = paramInt;
  }
  
  public void eui(String paramString) {
    this.ifu = paramString;
  }
  
  public void zxn(List<bjw> paramList) {
    this.aab = paramList;
  }
  
  public void clk(List<aua> paramList) {
    this.bko = paramList;
  }
  
  public void mif(String paramString) {
    this.gae = paramString;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\agq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */