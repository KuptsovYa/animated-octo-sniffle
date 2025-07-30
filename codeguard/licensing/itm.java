package codeguard.licensing;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public abstract class itm implements eui {
  private final Class itm;
  
  private final String omj;
  
  protected itm(Class paramClass, String paramString) {
    this.itm = paramClass;
    this.omj = paramString;
  }
  
  public InputStream getStream() throws IOException {
    InputStream inputStream = this.itm.getResourceAsStream(this.omj);
    if (inputStream == null)
      throw new FileNotFoundException(this.omj); 
    return inputStream;
  }
  
  public int hashCode() {
    null = 5;
    null = 97 * null + ((this.itm != null) ? this.itm.hashCode() : 0);
    return 97 * null + ((this.omj != null) ? this.omj.hashCode() : 0);
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof itm))
      return false; 
    itm itm1 = (itm)paramObject;
    return (this.itm.getResource(this.omj).equals(itm1.itm.getResource(itm1.omj)) && getAlias().equals(itm1.getAlias()));
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\itm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */