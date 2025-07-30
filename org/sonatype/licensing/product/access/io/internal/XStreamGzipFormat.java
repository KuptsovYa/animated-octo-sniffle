package org.sonatype.licensing.product.access.io.internal;

import codeguard.licensing.dvh;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.enterprise.inject.Typed;
import javax.inject.Named;
import javax.inject.Singleton;
import org.sonatype.licensing.product.access.AccessEntrySet;
import org.sonatype.licensing.product.access.io.FileFormat;

@Named
@Singleton
@Typed({FileFormat.class})
public class XStreamGzipFormat extends XStreamFormat {
  public static final int ID = 2;
  
  public AccessEntrySet read(InputStream paramInputStream) throws IOException {
    return super.read(new GZIPInputStream(paramInputStream));
  }
  
  public void write(AccessEntrySet paramAccessEntrySet, OutputStream paramOutputStream) throws IOException {
    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream((OutputStream)new dvh(paramOutputStream));
    try {
      super.write(paramAccessEntrySet, gZIPOutputStream);
    } finally {
      gZIPOutputStream.close();
    } 
  }
  
  public int identifier() {
    return 2;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\access\io\internal\XStreamGzipFormat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */