package org.sonatype.licensing.product;

public interface SslKeyContainer {
  String getPassword();
  
  String getEntry();
  
  Type getType();
  
  public enum Type {
    PKCS12, JKS;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\SslKeyContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */