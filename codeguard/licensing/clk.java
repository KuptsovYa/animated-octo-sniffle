package codeguard.licensing;

public class clk extends itm {
  private final String clk;
  
  private final String rkn;
  
  private final String zxn;
  
  public clk(Class paramClass, String paramString1, String paramString2, String paramString3, String paramString4) {
    super(paramClass, paramString1);
    this.clk = paramString2;
    this.rkn = paramString3;
    this.zxn = paramString4;
  }
  
  public String getAlias() {
    return this.clk;
  }
  
  public String getStorePwd() {
    return this.rkn;
  }
  
  public String getKeyPwd() {
    return this.zxn;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\clk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */