package org.sonatype.licensing.product.internal;

import com.google.common.annotations.VisibleForTesting;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonatype.licensing.LicenseKey;
import org.sonatype.licensing.LicensingException;
import org.sonatype.licensing.feature.Feature;
import org.sonatype.licensing.feature.FeatureValidator;
import org.sonatype.licensing.feature.LicenseFeatureVerifier;
import org.sonatype.licensing.product.ProductLicenseKey;

//@Named("licensing.default")
@Singleton
public class DefaultLicenseFeatureVerifier implements LicenseFeatureVerifier {
  private final Logger evv = LoggerFactory.getLogger(getClass());
  
  private final FeatureValidator gyk;
  
  private final ReadWriteLock ztm = new ReentrantReadWriteLock();
  
  private ProductLicenseKey ugf;
  
  private boolean utz;
  
  @Inject
  public DefaultLicenseFeatureVerifier(FeatureValidator paramFeatureValidator) {
    this.gyk = paramFeatureValidator;
  }
  
  public void verifyLicenseAndFeature(Feature paramFeature) throws LicensingException {
    Lock lock = this.ztm.readLock();
    lock.lock();
    try {
      if (this.evv.isTraceEnabled()) {
        this.evv.trace("Verify (throws) {}", paramFeature.getId());
        this.evv.trace("Current state: key={}, valid={}", this.ugf, Boolean.valueOf(this.utz));
      } 
      if (!this.utz)
        throw new LicensingException(this.ugf, "License is not valid.", null); 
      this.gyk.validate(paramFeature, (LicenseKey)this.ugf);
    } finally {
      lock.unlock();
    } 
  }
  
  public boolean verify(Feature paramFeature) {
    Lock lock = this.ztm.readLock();
    lock.lock();
    try {
      if (this.evv.isTraceEnabled()) {
        this.evv.trace("Verify (boolean) {}", paramFeature.getId());
        this.evv.trace("Current state: key={}, valid={}", this.ugf, Boolean.valueOf(this.utz));
      } 
      return (this.utz && this.gyk.isValid(paramFeature, (LicenseKey)this.ugf));
    } finally {
      lock.unlock();
    } 
  }
  
  @VisibleForTesting
  ProductLicenseKey dyw() {
    return this.ugf;
  }
  
  @VisibleForTesting
  boolean fvc() {
    return this.utz;
  }
  
  @VisibleForTesting
  public void updateState(ProductLicenseKey paramProductLicenseKey, boolean paramBoolean) {
    Lock lock = this.ztm.writeLock();
    lock.lock();
    try {
      this.evv.debug("Update state: key={}, valid={}", paramProductLicenseKey, Boolean.valueOf(paramBoolean));
      this.ugf = paramProductLicenseKey;
      this.utz = paramBoolean;
    } finally {
      lock.unlock();
    } 
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\internal\DefaultLicenseFeatureVerifier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */