package org.sonatype.licensing.product.access.io.internal;

import codeguard.licensing.dpq;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.XStreamException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.enterprise.inject.Typed;
import javax.inject.Named;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonatype.licensing.product.access.AccessEntrySet;
import org.sonatype.licensing.product.access.io.FileFormat;

@Named
@Singleton
@Typed({FileFormat.class})
public class XStreamFormat extends dpq {
  private static final Logger evv = LoggerFactory.getLogger(XStreamFormat.class);
  
  public static final int ID = 0;
  
  private final XStream xxd = new XStream();
  
  public XStreamFormat() {
    this.xxd.processAnnotations(AccessEntrySet.class);
  }
  
  public AccessEntrySet read(InputStream paramInputStream) throws IOException {
    try {
      return (AccessEntrySet)this.xxd.fromXML(paramInputStream);
    } catch (XStreamException xStreamException) {
      if (evv.isDebugEnabled()) {
        evv.error("Unable to parse access data", (Throwable)xStreamException);
      } else {
        evv.error("Unable to parse access data: " + xStreamException.getMessage());
      } 
      return new AccessEntrySet();
    } 
  }
  
  public void write(AccessEntrySet paramAccessEntrySet, OutputStream paramOutputStream) throws IOException {
    this.xxd.toXML(paramAccessEntrySet, paramOutputStream);
  }
  
  public int identifier() {
    return 0;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\access\io\internal\XStreamFormat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */