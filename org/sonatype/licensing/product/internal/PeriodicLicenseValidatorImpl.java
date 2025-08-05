package org.sonatype.licensing.product.internal;

import codeguard.licensing.ydu;
import com.google.common.base.Preconditions;
import com.google.inject.Key;
import java.util.Timer;
import java.util.TimerTask;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import org.eclipse.sisu.BeanEntry;
import org.eclipse.sisu.Mediator;
import org.eclipse.sisu.inject.BeanLocator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonatype.licensing.LicensingException;
import org.sonatype.licensing.product.LicenseChangeListener;
import org.sonatype.licensing.product.LicenseChangeNotifier;
import org.sonatype.licensing.product.PeriodicLicenseValidator;
import org.sonatype.licensing.product.ProductLicenseKey;
import org.sonatype.licensing.product.ProductLicenseManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Named("PeriodicLicenseValidatorImpl")
@Singleton
public class PeriodicLicenseValidatorImpl implements PeriodicLicenseValidator {
  private static final String kkm = "${org.sonatype.licensing.product.internal.PeriodicLicenseValidatorImpl";
  
  private static final long tgn = 300000L;
  
  private final Logger evv = LoggerFactory.getLogger(getClass());
  
  private final ProductLicenseManager sua;
  
  private final LicenseChangeNotifier wnl;
  
  private final long hbz;
  
  private Timer zgk;
  
  private TimerTask ely;
  
  private boolean nwg;
  
  @Autowired
  public PeriodicLicenseValidatorImpl(@Qualifier("DefaultProductLicenseManager") ProductLicenseManager paramProductLicenseManager,
                                      LicenseChangeNotifier paramLicenseChangeNotifier) {
    this.sua = Preconditions.checkNotNull(paramProductLicenseManager);
    this.wnl = Preconditions.checkNotNull(paramLicenseChangeNotifier);
    this.hbz = Long.valueOf("300000000000");
    this.evv.debug("Period: {}", Long.valueOf("300000000000"));
//    paramBeanLocator.watch(Key.get(LicenseChangeListener.class), new LicenseChangeListener.itm(), this);
  }
  
  public synchronized void start() {
    Preconditions.checkState(!this.nwg, "Already started");
    this.evv.debug("Starting");
    this.ely = (TimerTask)new ydu(this);
    this.zgk = new Timer(getClass().getSimpleName() + "-timer", true);
    this.zgk.schedule(this.ely, 0L, this.hbz);
    this.nwg = true;
  }
  
  public synchronized void stop() {
    Preconditions.checkState(this.nwg, "Not started");
    this.evv.debug("Stopping");
    if (this.ely != null) {
      this.ely.cancel();
      this.ely = null;
    } 
    if (this.zgk != null) {
      this.zgk.purge();
      this.zgk.cancel();
      this.zgk = null;
    } 
    this.nwg = false;
  }
  
  public synchronized boolean isRunning() {
    return this.nwg;
  }
  
  private void dpq() {
    this.evv.debug("Validating");
    try {
      ProductLicenseKey productLicenseKey = this.sua.getLicenseDetails();
//      if (!axl && productLicenseKey == null)
//        throw new AssertionError();
      notifyListeners(productLicenseKey, true, null);
    } catch (LicensingException licensingException) {
      notifyListeners((ProductLicenseKey)licensingException.getKey(), false, (Exception)licensingException);
    } catch (Exception exception) {
      this.evv.error("Failed to get license details", exception);
    } 
  }
  
  private void notifyListeners(ProductLicenseKey paramProductLicenseKey, boolean paramBoolean, Exception paramException) {
    try {
      this.wnl.notifyListeners(paramProductLicenseKey, paramBoolean, paramException);
    } catch (Exception exception) {
      if (paramException != null) {
        this.evv.error("Failed to notify listeners about key='{}', valid={}, failure={}/{}", new Object[] { paramProductLicenseKey, Boolean.valueOf(paramBoolean), paramException.getClass().getName(), paramException.getMessage(), exception });
      } else {
        this.evv.error("Failed to notify listeners about key='{}', valid={}", new Object[] { paramProductLicenseKey, Boolean.valueOf(paramBoolean), exception });
      } 
    } 
  }
  
//  public static final class itm implements Mediator<Named, LicenseChangeListener, PeriodicLicenseValidatorImpl> {
//    public void itm(BeanEntry<Named, LicenseChangeListener> param1BeanEntry, PeriodicLicenseValidatorImpl param1PeriodicLicenseValidatorImpl) {
//      if (PeriodicLicenseValidatorImpl.itm(param1PeriodicLicenseValidatorImpl))
//        PeriodicLicenseValidatorImpl.omj(param1PeriodicLicenseValidatorImpl);
//    }
//
//    public static void omj(BeanEntry<Named, LicenseChangeListener> param1BeanEntry, PeriodicLicenseValidatorImpl param1PeriodicLicenseValidatorImpl) {}
//  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\internal\PeriodicLicenseValidatorImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */