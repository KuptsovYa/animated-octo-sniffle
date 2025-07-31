package codeguard.licensing;

import java.io.File;
import javax.swing.filechooser.FileFilter;

class vep extends FileFilter {
  vep(bab parambab, String paramString) {}
  
  public boolean accept(File paramFile) {
    return (paramFile.isDirectory() || paramFile.getPath().toLowerCase().endsWith(bab.mpl));
  }
  
  public String getDescription() {
//    return this.lcw + bab.pwn();
    return "this.lcw" + "bab.pwn()";
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\vep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */