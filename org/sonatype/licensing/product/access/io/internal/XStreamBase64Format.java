package org.sonatype.licensing.product.access.io.internal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.enterprise.inject.Typed;
import javax.inject.Named;
import javax.inject.Singleton;
import org.codehaus.plexus.util.Base64;
import org.codehaus.plexus.util.IOUtil;
import org.sonatype.licensing.product.access.AccessEntrySet;
import org.sonatype.licensing.product.access.io.FileFormat;

@Named
@Singleton
@Typed({FileFormat.class})
public class XStreamBase64Format extends XStreamFormat {
  public static final int ID = 1;
  
  public AccessEntrySet read(InputStream paramInputStream) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    IOUtil.copy(paramInputStream, byteArrayOutputStream);
    IOUtil.close(paramInputStream);
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decodeBase64(byteArrayOutputStream.toByteArray()));
    return super.read(byteArrayInputStream);
  }
  
  public void write(AccessEntrySet paramAccessEntrySet, OutputStream paramOutputStream) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    super.write(paramAccessEntrySet, byteArrayOutputStream);
    paramOutputStream.write(Base64.encodeBase64(byteArrayOutputStream.toByteArray()));
  }
  
  public int identifier() {
    return 1;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\access\io\internal\XStreamBase64Format.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */