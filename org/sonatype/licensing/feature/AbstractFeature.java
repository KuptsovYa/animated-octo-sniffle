package org.sonatype.licensing.feature;

import java.util.Set;

public abstract class AbstractFeature implements Feature {
  public boolean equals(Object paramObject) {
    if (paramObject == null || !(paramObject instanceof Feature))
      return false; 
    Feature feature = (Feature)paramObject;
    return getId().equals(feature.getId());
  }
  
  public int hashCode() {
    return getId().hashCode();
  }
  
  public String toString() {
    return "Id: " + getId() + ", Name: " + getName() + ", Description: " + getDescription();
  }
  
  public Set<String> getSubFeatureIds() {
    return null;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\feature\AbstractFeature.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */