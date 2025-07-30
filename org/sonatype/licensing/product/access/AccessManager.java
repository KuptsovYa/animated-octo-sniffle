package org.sonatype.licensing.product.access;

import java.io.IOException;
import java.util.Date;
import java.util.Set;

public interface AccessManager {
  boolean add(AccessEntry paramAccessEntry);
  
  void save() throws IOException;
  
  Set<AccessEntry> getSince(Date paramDate);
  
  Set<AccessEntry> expire(Date paramDate);
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\access\AccessManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */