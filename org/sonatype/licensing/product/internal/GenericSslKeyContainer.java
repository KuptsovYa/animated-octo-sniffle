package org.sonatype.licensing.product.internal;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import org.codehaus.plexus.util.Base64;
import org.sonatype.licensing.product.SslKeyContainer;

public class GenericSslKeyContainer implements SslKeyContainer {
  private String tlx;
  
  private String ooh;
  
  private SslKeyContainer.Type ury;
  
  public GenericSslKeyContainer(String paramString1, String paramString2, SslKeyContainer.Type paramType) {
    this.tlx = paramString1;
    this.ooh = paramString2;
    this.ury = paramType;
  }
  
  public GenericSslKeyContainer(File paramFile, String paramString, SslKeyContainer.Type paramType) throws IOException {
    this(eui(paramFile), paramString, paramType);
  }
  
  public static String b64encode(byte[] paramArrayOfbyte) throws UnsupportedEncodingException {
    byte[] arrayOfByte = Base64.encodeBase64(paramArrayOfbyte);
    return new String(arrayOfByte, "US-ASCII");
  }
  
  private static String eui(File paramFile) {
    RandomAccessFile randomAccessFile = null;
    try {
      randomAccessFile = new RandomAccessFile(paramFile, "r");
      byte[] arrayOfByte = new byte[(int)randomAccessFile.length()];
      randomAccessFile.readFully(arrayOfByte);
      return b64encode(arrayOfByte);
    } catch (IOException iOException) {
      throw new IllegalArgumentException("Cannot base64encode file: " + iOException.toString(), iOException);
    } finally {
      if (randomAccessFile != null)
        try {
          randomAccessFile.close();
        } catch (IOException iOException) {} 
    } 
  }
  
  public String getPassword() {
    return this.ooh;
  }
  
  public void setPassword(String paramString) {
    this.ooh = paramString;
  }
  
  public String getEntry() {
    return this.tlx;
  }
  
  public void setEntry(String paramString) {
    this.tlx = paramString;
  }
  
  public SslKeyContainer.Type getType() {
    return this.ury;
  }
  
  public void setType(SslKeyContainer.Type paramType) {
    this.ury = paramType;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\internal\GenericSslKeyContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */