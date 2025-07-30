package codeguard.licensing;

import java.io.IOException;
import java.io.OutputStream;

public class dvh extends OutputStream {
  private final OutputStream eel;
  
  public dvh(OutputStream paramOutputStream) {
    this.eel = paramOutputStream;
  }
  
  public void close() throws IOException {}
  
  public void write(int paramInt) throws IOException {
    this.eel.write(paramInt);
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\dvh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */