package org.sonatype.licensing.product.access.internal;

import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Named;
import org.sonatype.licensing.product.access.AccessBlocker;
import org.sonatype.licensing.product.access.AccessChecker;
import org.sonatype.licensing.product.access.AccessEntry;
import org.sonatype.licensing.product.access.AccessManager;
import org.sonatype.licensing.product.access.AccessTracker;

//@Named("licensing.default")
public class DefaultAccessTracker implements AccessTracker {
  private final AccessManager krh;
  
  private final AccessChecker onp;
  
  private final AccessBlocker rbr;
  
  @Inject
  public DefaultAccessTracker(AccessManager paramAccessManager, @Nullable AccessChecker paramAccessChecker, @Nullable AccessBlocker paramAccessBlocker) {
    this.krh = paramAccessManager;
    if (paramAccessChecker == null) {
      this.onp = new omj(null);
    } else {
      this.onp = paramAccessChecker;
    } 
    if (paramAccessBlocker == null) {
      this.rbr = new itm(null);
    } else {
      this.rbr = paramAccessBlocker;
    } 
  }
  
  public void add(Object paramObject) {
    AccessEntry accessEntry = new AccessEntry(paramObject);
    if (!this.onp.check(this.krh, accessEntry)) {
      this.rbr.enable();
    } else {
      this.rbr.disable();
    } 
    this.krh.add(accessEntry);
  }
  
  class itm implements AccessBlocker {
    private itm(DefaultAccessTracker this$0) {}
    
    public void enable() {}
    
    public void disable() {}
  }
  
  class omj implements AccessChecker {
    private omj(DefaultAccessTracker this$0) {}
    
    public boolean check(AccessManager param1AccessManager, AccessEntry param1AccessEntry) {
      return true;
    }
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\access\internal\DefaultAccessTracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */