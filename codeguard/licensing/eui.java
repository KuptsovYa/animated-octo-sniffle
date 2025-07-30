package codeguard.licensing;

import java.io.IOException;
import java.io.InputStream;

public interface eui {
  InputStream getStream() throws IOException;
  
  String getAlias();
  
  String getStorePwd();
  
  String getKeyPwd();
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\eui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */