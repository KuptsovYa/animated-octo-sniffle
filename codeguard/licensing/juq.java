package codeguard.licensing;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import org.sonatype.licensing.product.SslKeyContainer;
import org.sonatype.licensing.product.internal.GenericSslKeyContainer;

public class juq extends GenericSslKeyContainer {
  public juq(File paramFile, String paramString) throws IOException {
    super(paramFile, paramString, SslKeyContainer.Type.JKS);
  }
  
  public juq(String paramString1, String paramString2) {
    super(paramString1, paramString2, SslKeyContainer.Type.JKS);
  }
  
  public juq(KeyStore paramKeyStore, String paramString) {
    super(itm(paramKeyStore, paramString), paramString, SslKeyContainer.Type.JKS);
  }
  
  private static String itm(KeyStore paramKeyStore, String paramString) {
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      paramKeyStore.store(byteArrayOutputStream, paramString.toCharArray());
      byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
      return b64encode(arrayOfByte);
    } catch (Exception exception) {
      throw new IllegalArgumentException("Failed to read and base64-encode key store", exception);
    } 
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\juq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */