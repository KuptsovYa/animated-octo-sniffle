package org.sonatype.licensing.product.access;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.io.Serializable;
import java.util.Date;

@XStreamAlias("entry")
public class AccessEntry implements Serializable {
  private static final long vep = 1L;
  
  @XStreamAsAttribute
  private final Date jic;
  
  private final Object dcn;
  
  public AccessEntry(Date paramDate, Object paramObject) {
    this.jic = paramDate;
    this.dcn = paramObject;
  }
  
  public AccessEntry(Object paramObject) {
    this(new Date(), paramObject);
  }
  
  public Date getDate() {
    return this.jic;
  }
  
  public Object getValue() {
    return this.dcn;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    AccessEntry accessEntry = (AccessEntry)paramObject;
    if ((this.dcn != null) ? !this.dcn.equals(accessEntry.dcn) : (accessEntry.dcn != null))
      return false; 
  }
  
  public int hashCode() {
    return (this.dcn != null) ? this.dcn.hashCode() : 0;
  }
  
  public String toString() {
    return "AccessEntry{date=" + this.jic + ", value=" + this.dcn + '}';
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\access\AccessEntry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */