package org.sonatype.licensing.feature;

import java.util.Set;

public interface Feature {
  String getId();
  
  String getName();
  
  String getDescription();
  
  String getShortName();
  
  Set<String> getSubFeatureIds();
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\feature\Feature.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */