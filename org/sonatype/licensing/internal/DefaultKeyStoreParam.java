package org.sonatype.licensing.internal;

import codeguard.licensing.clk;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DefaultKeyStoreParam extends clk {
  String alq = null;
  
  public DefaultKeyStoreParam(Class<?> paramClass, String paramString1, String paramString2, String paramString3, String paramString4) {
    super(paramClass, paramString1, paramString2, paramString3, paramString4);
    this.alq = paramString1;
  }
  
  public InputStream getStream() throws IOException {
    try {
      return super.getStream();
    } catch (IOException iOException) {
      return new FileInputStream(this.alq);
    } 
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\internal\DefaultKeyStoreParam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */