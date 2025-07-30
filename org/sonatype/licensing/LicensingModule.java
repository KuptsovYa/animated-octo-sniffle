package org.sonatype.licensing;

import com.google.inject.AbstractModule;
import com.google.inject.Injector;
import com.google.inject.matcher.Matchers;
import javax.inject.Provider;
import org.aopalliance.intercept.MethodInterceptor;
import org.sonatype.licensing.feature.LicenseFeatureInterceptor;
import org.sonatype.licensing.feature.LicenseFeatureVerifier;

public class LicensingModule extends AbstractModule {
  protected void configure() {
    bindInterceptor(Matchers.any(), Matchers.annotatedWith(RequiresLicense.class), new MethodInterceptor[] { (MethodInterceptor)new LicenseFeatureInterceptor((Provider)getProvider(Injector.class), (Provider)getProvider(LicenseFeatureVerifier.class)) });
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\LicensingModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */