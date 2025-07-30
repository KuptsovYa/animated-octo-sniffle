package codeguard.licensing;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ysn extends ClassLoader {
  private static final Set<String> llk;
  
  public ysn() {
    super(Thread.currentThread().getContextClassLoader());
  }
  
  protected Class<?> loadClass(String paramString, boolean paramBoolean) throws ClassNotFoundException {
    if (!llk.contains(paramString)) {
      System.err.format("ERROR [%s] %s - Banned class: %s%n", new Object[] { Thread.currentThread().getName(), ysn.class.getName(), paramString });
      throw new itm(paramString);
    } 
    return super.loadClass(paramString, paramBoolean);
  }
  
  static {
    HashSet<String> hashSet = new HashSet();
    hashSet.add("de.schlichtherle.xml.GenericCertificate");
    hashSet.add("de.schlichtherle.license.LicenseContent");
    hashSet.add("org.sonatype.licensing.CustomLicenseContent");
    hashSet.add("com.sonatype.license.PlexusLicenseContent");
    hashSet.add("java.beans.XMLDecoder");
    hashSet.add("java.util.Date");
    hashSet.add("javax.security.auth.x500.X500Principal");
    llk = Collections.unmodifiableSet(hashSet);
  }
  
  static class itm extends RuntimeException {
    public itm(String param1String) {
      super(param1String);
    }
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\ysn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */