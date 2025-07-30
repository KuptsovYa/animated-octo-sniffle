package org.sonatype.licensing.product.access.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.sonatype.licensing.product.access.AccessEntrySet;

public interface FileFormat {
  AccessEntrySet read(InputStream paramInputStream) throws IOException;
  
  void write(AccessEntrySet paramAccessEntrySet, OutputStream paramOutputStream) throws IOException;
  
  int identifier();
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\access\io\FileFormat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */