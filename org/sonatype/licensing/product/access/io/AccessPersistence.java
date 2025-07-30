package org.sonatype.licensing.product.access.io;

import java.io.IOException;
import org.sonatype.licensing.product.access.AccessEntrySet;

public interface AccessPersistence {
  AccessEntrySet load() throws IOException;
  
  void save(AccessEntrySet paramAccessEntrySet) throws IOException;
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\access\io\AccessPersistence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */