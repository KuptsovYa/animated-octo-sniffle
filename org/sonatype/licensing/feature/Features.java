package org.sonatype.licensing.feature;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

//@Named("licensing.default")
@Singleton
@Component
public class Features {
  private Map<String, Feature> bwp;
  
  @Inject
  public Features(Map<String, Feature> paramMap) {
    this.bwp = paramMap;
  }
  
  public Map<String, Feature> getAvailableFeatures() {
    return Collections.unmodifiableMap(this.bwp);
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\feature\Features.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */