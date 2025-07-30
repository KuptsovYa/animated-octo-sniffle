package org.sonatype.licensing.product;

public interface LicenseChangeListener {
  void licenseChanged(ProductLicenseKey paramProductLicenseKey, boolean paramBoolean);
  
  public static class itm implements LicenseChangeListener {
    public void licenseChanged(ProductLicenseKey param1ProductLicenseKey, boolean param1Boolean) {}
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\product\LicenseChangeListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */