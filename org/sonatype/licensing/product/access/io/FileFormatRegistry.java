package org.sonatype.licensing.product.access.io;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@Named("licensing.default")
@Singleton
public class FileFormatRegistry {
  private static final Logger evv = LoggerFactory.getLogger(FileFormatRegistry.class);
  
  private final Map<Integer, FileFormat> wie = new HashMap<Integer, FileFormat>();
  
  @Inject
  public FileFormatRegistry(List<FileFormat> paramList) {
    for (FileFormat fileFormat : paramList)
      addFormat(fileFormat); 
  }
  
  public synchronized FileFormat getFormat(int paramInt) {
    return this.wie.get(Integer.valueOf(paramInt));
  }
  
  public synchronized void addFormat(FileFormat paramFileFormat) {
    evv.debug("Adding format: {}", paramFileFormat);
    int i = paramFileFormat.identifier();
    if (this.wie.containsKey(Integer.valueOf(i)))
      throw new IllegalStateException(String.format("Format already exists with ID: %d", new Object[] { Integer.valueOf(i) })); 
    this.wie.put(Integer.valueOf(i), paramFileFormat);
  }
  
  public synchronized Collection<FileFormat> getAllFormats() {
    return Collections.unmodifiableCollection(this.wie.values());
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\access\io\FileFormatRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */