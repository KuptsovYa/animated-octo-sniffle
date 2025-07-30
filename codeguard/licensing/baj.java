package codeguard.licensing;

import java.text.MessageFormat;
import java.util.ResourceBundle;

class baj {
  private static final String dhn = (new Obfuscator(new long[] { -1350665201776450749L, -216656036460523244L, -1481304226977776272L, -2463710388362402838L, -6044068851221630479L, -2266461419465064627L })).toString();
  
  private static final ResourceBundle mar = ResourceBundle.getBundle(dhn);
  
  public static String omj(String paramString) {
    return mar.getString(paramString);
  }
  
  public static String itm(String paramString, Object[] paramArrayOfObject) {
    return MessageFormat.format(omj(paramString), paramArrayOfObject);
  }
  
  public static String itm(String paramString, Object paramObject) {
    return MessageFormat.format(omj(paramString), new Object[] { paramObject });
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\baj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */