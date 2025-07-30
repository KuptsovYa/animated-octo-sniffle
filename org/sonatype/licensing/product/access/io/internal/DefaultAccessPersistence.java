package org.sonatype.licensing.product.access.io.internal;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonatype.licensing.product.access.AccessEntrySet;
import org.sonatype.licensing.product.access.io.AccessPersistence;
import org.sonatype.licensing.product.access.io.FileFormat;
import org.sonatype.licensing.product.access.io.FileFormatRegistry;

@Named("licensing.default")
public class DefaultAccessPersistence implements AccessPersistence {
  private static final Logger evv = LoggerFactory.getLogger(DefaultAccessPersistence.class);
  
  public static final int DEFAULT_SAVE_FORMAT = 0;
  
  private final FileFormat wmd;
  
  private final File rvm;
  
  private final FileFormatRegistry cfw;
  
  @Inject
  public DefaultAccessPersistence(FileFormatRegistry paramFileFormatRegistry, @Named("licensing.access.file") File paramFile, @Nullable @Named("licensing.access.file.formatId") Integer paramInteger) {
    this.cfw = paramFileFormatRegistry;
    this.rvm = paramFile.getAbsoluteFile();
    if (!this.rvm.exists())
      this.rvm.getParentFile().mkdirs(); 
    evv.debug("File: {}", paramFile);
    this.wmd = paramFileFormatRegistry.getFormat((paramInteger != null) ? paramInteger.intValue() : 0);
    evv.debug("Save format: {}", this.wmd);
  }
  
  public AccessEntrySet load() throws IOException {
    if (!this.rvm.isFile() || this.rvm.length() == 0L)
      return new AccessEntrySet(); 
    BufferedInputStream bufferedInputStream = null;
    try {
      evv.debug("Loading");
      bufferedInputStream = new BufferedInputStream(new FileInputStream(this.rvm));
      FileFormat fileFormat = this.cfw.getFormat(bufferedInputStream.read());
      if (fileFormat == null)
        throw new IOException("Could not read access entries: FileFormat unavailable"); 
      AccessEntrySet accessEntrySet = fileFormat.read(bufferedInputStream);
      return (accessEntrySet == null) ? new AccessEntrySet() : accessEntrySet;
    } finally {
      if (bufferedInputStream != null)
        bufferedInputStream.close(); 
    } 
  }
  
  public void save(AccessEntrySet paramAccessEntrySet) throws IOException {
    BufferedOutputStream bufferedOutputStream = null;
    try {
      evv.debug("Saving");
      bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.rvm));
      bufferedOutputStream.write(this.wmd.identifier());
      this.wmd.write(paramAccessEntrySet, bufferedOutputStream);
    } finally {
      if (bufferedOutputStream != null)
        bufferedOutputStream.close(); 
    } 
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\access\io\internal\DefaultAccessPersistence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */