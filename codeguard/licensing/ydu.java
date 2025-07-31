package codeguard.licensing;

import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonatype.licensing.product.internal.PeriodicLicenseValidatorImpl;

public class ydu extends TimerTask {
  private static final Logger log = LoggerFactory.getLogger(ydu.class);

  public ydu(PeriodicLicenseValidatorImpl paramPeriodicLicenseValidatorImpl) {}
  
  public void run() {
    log.info("Здесь где-то должен быть run");
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\ydu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */