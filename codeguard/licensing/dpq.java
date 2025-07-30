package codeguard.licensing;

import org.sonatype.licensing.product.access.io.FileFormat;

public abstract class dpq implements FileFormat {
  public String toString() {
    return getClass().getSimpleName() + "{id=" + identifier() + '}';
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\dpq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */