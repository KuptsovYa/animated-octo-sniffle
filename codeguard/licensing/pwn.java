package codeguard.licensing;

import de.schlichtherle.license.IllegalPasswordException;

public class pwn {
  private static pwn jjo;
  
  public static void itm(pwn parampwn) {
    jjo = parampwn;
  }
  
  public static pwn chr() {
    if (jjo == null)
      jjo = new pwn(); 
    return jjo;
  }
  
  public void itm(String paramString) {
    int i = paramString.length();
    if (paramString == null)
      throw new IllegalPasswordException(); 
    if (i < 6)
      throw new IllegalPasswordException(); 
    boolean bool1 = false;
    boolean bool2 = false;
    for (byte b = 0; b < i; b++) {
      char c = paramString.charAt(b);
      if (Character.isLetter(c)) {
        bool1 = true;
      } else if (Character.isDigit(c)) {
        bool2 = true;
      } 
    } 
    if (!bool1 || !bool2)
      throw new IllegalPasswordException(); 
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\pwn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */