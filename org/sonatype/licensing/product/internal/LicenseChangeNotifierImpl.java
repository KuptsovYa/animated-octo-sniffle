package org.sonatype.licensing.product.internal;

import com.google.common.base.Preconditions;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonatype.licensing.product.LicenseChangeListener;
import org.sonatype.licensing.product.LicenseChangeNotifier;
import org.sonatype.licensing.product.ProductLicenseKey;
import org.sonatype.licensing.product.util.LicenseFingerprintStrategy;

//@Named("licensing.default")
@Singleton
public class LicenseChangeNotifierImpl implements LicenseChangeNotifier {
  private final Logger evv = LoggerFactory.getLogger(getClass());
  
  private final List<LicenseChangeListener> bji;
  
  private final DefaultLicenseFeatureVerifier yhh;
  
  private final LicenseFingerprintStrategy fcp;
  
  private final Map<LicenseChangeListener, AtomicReference<itm>> wfo = new WeakHashMap<LicenseChangeListener, AtomicReference<itm>>();
  
  @Inject
  public LicenseChangeNotifierImpl(List<LicenseChangeListener> paramList, DefaultLicenseFeatureVerifier paramDefaultLicenseFeatureVerifier, LicenseFingerprintStrategy paramLicenseFingerprintStrategy) {
    this.yhh = (DefaultLicenseFeatureVerifier)Preconditions.checkNotNull(paramDefaultLicenseFeatureVerifier);
    this.bji = (List<LicenseChangeListener>)Preconditions.checkNotNull(paramList);
    this.fcp = (LicenseFingerprintStrategy)Preconditions.checkNotNull(paramLicenseFingerprintStrategy);
  }
  
  public void notifyListeners(ProductLicenseKey paramProductLicenseKey, boolean paramBoolean, Exception paramException) {
    if (paramException != null) {
      this.evv.debug("License invalid", paramException);
    } else {
      this.evv.debug("License {}", paramBoolean ? "valid" : "invalid");
    } 
    this.yhh.updateState(paramProductLicenseKey, paramBoolean);
    String str = (paramProductLicenseKey != null) ? this.fcp.calculate(paramProductLicenseKey) : null;
    for (LicenseChangeListener licenseChangeListener : this.bji) {
      AtomicReference<itm> atomicReference;
      synchronized (this.wfo) {
        atomicReference = this.wfo.get(licenseChangeListener);
        if (atomicReference == null) {
          atomicReference = new AtomicReference(null);
          this.wfo.put(licenseChangeListener, atomicReference);
        } 
      } 
      itm itm = new itm(str, paramBoolean);
      if (!itm.equals(atomicReference.getAndSet(itm))) {
        this.evv.trace("Notifying listener: {}", licenseChangeListener);
        try {
          licenseChangeListener.licenseChanged(paramProductLicenseKey, paramBoolean);
        } catch (Exception exception) {
          this.evv.trace("Failed to notify listener", exception);
        } 
        continue;
      } 
      this.evv.trace("Skipping listener notification; state has not changed: {}", licenseChangeListener);
    } 
  }
  
  static class itm {
    final String uec;
    
    final boolean utz;
    
    private itm(String param1String, boolean param1Boolean) {
      this.uec = param1String;
      this.utz = param1Boolean;
    }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (param1Object == null || getClass() != param1Object.getClass())
        return false; 
      itm itm1 = (itm)param1Object;
      return (this.utz != itm1.utz) ? false : (!((this.uec != null) ? !this.uec.equals(itm1.uec) : (itm1.uec != null)));
    }
    
    public int hashCode() {
      return (this.uec != null) ? this.uec.hashCode() : 0;
    }
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\internal\LicenseChangeNotifierImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */