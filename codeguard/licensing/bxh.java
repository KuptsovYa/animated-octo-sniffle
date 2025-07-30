package codeguard.licensing;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class bxh {
  private static final String dhn = (new Obfuscator(new long[] { 6055227168551487552L, 5834857350928301681L, 4273642861057763346L, -1622634856111526471L, 6636310379452924396L, -2362982053890309465L })).toString();
  
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


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\bxh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */