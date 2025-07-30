package org.sonatype.licensing.product.access;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamInclude;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

@XStreamAlias("entries")
@XStreamInclude({AccessEntry.class})
public class AccessEntrySet implements Serializable, Iterable<AccessEntry> {
  private static final long vep = 1L;
  
  @XStreamImplicit
  private Set<AccessEntry> hcr;
  
  private Set<AccessEntry> bjw() {
    if (this.hcr == null)
      this.hcr = new LinkedHashSet<AccessEntry>(); 
    return this.hcr;
  }
  
  public Iterator<AccessEntry> iterator() {
    return bjw().iterator();
  }
  
  public int size() {
    return bjw().size();
  }
  
  public void clear() {
    bjw().clear();
  }
  
  public void add(AccessEntry paramAccessEntry) {
    if (!axl && paramAccessEntry == null)
      throw new AssertionError(); 
    if (bjw().contains(paramAccessEntry))
      bjw().remove(paramAccessEntry); 
    bjw().add(paramAccessEntry);
  }
  
  public boolean retainAll(Collection<?> paramCollection) {
    return bjw().retainAll(paramCollection);
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\access\AccessEntrySet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */