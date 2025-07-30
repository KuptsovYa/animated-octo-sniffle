package codeguard.licensing;

import java.io.File;
import java.io.IOException;
import org.sonatype.licensing.product.SslKeyContainer;
import org.sonatype.licensing.product.internal.GenericSslKeyContainer;

public class seo extends GenericSslKeyContainer {
  public seo(File paramFile, String paramString) throws IOException {
    super(paramFile, paramString, SslKeyContainer.Type.PKCS12);
  }
  
  public seo(String paramString1, String paramString2) {
    super(paramString1, paramString2, SslKeyContainer.Type.PKCS12);
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\seo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */