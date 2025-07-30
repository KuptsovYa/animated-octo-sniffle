package org.sonatype.licensing.feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class FeatureSet implements Iterable<Feature> {
  private final List<Feature> dlc = new ArrayList<Feature>();
  
  public void addFeature(Feature paramFeature) {
    if (paramFeature == null)
      throw new NullPointerException("feature must not be null!"); 
    this.dlc.add(paramFeature);
  }
  
  public boolean hasFeature(Feature paramFeature) {
    HashSet<String> hashSet = new HashSet();
    for (Feature feature : this.dlc) {
      hashSet.add(feature.getId());
      if (feature.getSubFeatureIds() != null)
        hashSet.addAll(feature.getSubFeatureIds()); 
    } 
    return hashSet.contains(paramFeature.getId());
  }
  
  public boolean hasFeatures() {
    return (this.dlc.size() > 0);
  }
  
  List<Feature> zhj() {
    return Collections.unmodifiableList(this.dlc);
  }
  
  public Iterator<Feature> iterator() {
    return zhj().iterator();
  }
  
  public int size() {
    return this.dlc.size();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("FeatureSet{");
    stringBuilder.append("features=").append(this.dlc);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\feature\FeatureSet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */