package org.sonatype.licensing.feature;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.inject.Injector;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Provider;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonatype.licensing.RequiresLicense;

public class LicenseFeatureInterceptor implements MethodInterceptor {
  private static final Logger evv = LoggerFactory.getLogger(LicenseFeatureInterceptor.class);
  
  private final Provider<Injector> iui;
  
  private final Provider<LicenseFeatureVerifier> tjb;
  
  public LicenseFeatureInterceptor(Provider<Injector> paramProvider, Provider<LicenseFeatureVerifier> paramProvider1) {
    this.iui = (Provider<Injector>)Preconditions.checkNotNull(paramProvider);
    this.tjb = (Provider<LicenseFeatureVerifier>)Preconditions.checkNotNull(paramProvider1);
  }
  
  public Object invoke(MethodInvocation paramMethodInvocation) throws Throwable {
    LicenseFeatureVerifier licenseFeatureVerifier = (LicenseFeatureVerifier)this.tjb.get();
    Preconditions.checkState((licenseFeatureVerifier != null), "Could not get a " + LicenseFeatureVerifier.class.getName());
    List<Feature> list = itm(paramMethodInvocation);
    if (evv.isDebugEnabled())
      evv.debug("Verifying license and features {} upon calling {}", list, paramMethodInvocation.getMethod()); 
    for (Feature feature : list)
      licenseFeatureVerifier.verifyLicenseAndFeature(feature); 
    return paramMethodInvocation.proceed();
  }
  
  private List<Feature> itm(MethodInvocation paramMethodInvocation) {
    RequiresLicense requiresLicense = omj(paramMethodInvocation);
    Class[] arrayOfClass = requiresLicense.features();
    ArrayList<Object> arrayList = Lists.newArrayList();
    Injector injector = (Injector)this.iui.get();
    Preconditions.checkState((injector != null), "Could not get an " + Injector.class.getName());
    for (Class clazz : arrayOfClass)
      arrayList.add(injector.getInstance(clazz)); 
    return arrayList;
  }
  
  private RequiresLicense omj(MethodInvocation paramMethodInvocation) {
    return paramMethodInvocation.getMethod().<RequiresLicense>getAnnotation(RequiresLicense.class);
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\feature\LicenseFeatureInterceptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */