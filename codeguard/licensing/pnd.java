package codeguard.licensing;

import de.schlichtherle.license.LicenseNotaryException;
import de.schlichtherle.xml.GenericCertificate;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;

public class pnd {
  private static final int quo = 5120;
  
  static final String dpq = (new Obfuscator(new long[] { 668274362144012114L, -2115765889337599212L })).toString();
  
  private static final String vjs = (new Obfuscator(new long[] { 1112708769776922148L, 6703392504509681290L })).toString();
  
  private static final String sja = (new Obfuscator(new long[] { -7210613020960449599L, 222075784786550139L, 9025728610804768010L })).toString();
  
  private static final String xfl = (new Obfuscator(new long[] { -1386002024146642540L, 4133952825992554401L, -8020387964636761861L })).toString();
  
  private static final String vnt = (new Obfuscator(new long[] { -2960555953270849419L, 3827258740935670554L, -3005417608224527600L, 1939660993088349256L, 4750831951568910874L })).toString();
  
  private static final String fku = (new Obfuscator(new long[] { -3872127676557769698L, -2469202953083814859L, 6713970776812571709L, -482260351456063412L })).toString();
  
  private static final String kjq = (new Obfuscator(new long[] { -1509550478491572167L, 1688274905166048601L, -4620167493569680976L })).toString();
  
  private static final String ynq = (new Obfuscator(new long[] { -6234396975553918200L, 2370155821952859770L })).toString();
  
  private eui ylu;
  
  private KeyStore age;
  
  private PrivateKey cnv;
  
  private PublicKey yww;
  
  protected pnd() {}
  
  public pnd(eui parameui) {
    omj(parameui);
  }
  
  public eui getKeyStoreParam() {
    return this.ylu;
  }
  
  public void itm(eui parameui) {
    omj(parameui);
  }
  
  private void omj(eui parameui) {
    if (parameui == null)
      throw new NullPointerException(dpq); 
    if (parameui.getAlias() == null)
      throw new NullPointerException(vjs); 
    pwn pwn = pwn.chr();
    String str1 = parameui.getStorePwd();
    pwn.itm(str1);
    String str2 = parameui.getKeyPwd();
    if (str2 != null)
      pwn.itm(str2); 
    this.ylu = parameui;
    this.age = null;
    this.cnv = null;
    this.yww = null;
  }
  
  public GenericCertificate omj(Object paramObject) throws Exception {
    GenericCertificate genericCertificate = new GenericCertificate();
    itm(genericCertificate, paramObject);
    return genericCertificate;
  }
  
  void itm(GenericCertificate paramGenericCertificate, Object paramObject) throws Exception {
    paramGenericCertificate.sign(paramObject, ifr(), ajd());
  }
  
  public void omj(GenericCertificate paramGenericCertificate) throws Exception {
    paramGenericCertificate.verify(bxh(), ajd());
  }
  
  protected PrivateKey ifr() throws LicenseNotaryException, IOException, CertificateException, NoSuchAlgorithmException, UnrecoverableKeyException {
    if (this.cnv == null) {
      eui eui1 = getKeyStoreParam();
      String str1 = eui1.getKeyPwd();
      String str2 = eui1.getAlias();
      if (str1 == null)
        throw new LicenseNotaryException(sja, str2); 
      KeyStore keyStore = zts();
      try {
        this.cnv = (PrivateKey)keyStore.getKey(str2, str1.toCharArray());
      } catch (KeyStoreException keyStoreException) {
        throw new AssertionError(keyStoreException);
      } 
      if (this.cnv == null)
        throw new LicenseNotaryException(xfl, str2); 
    } 
    return this.cnv;
  }
  
  protected PublicKey bxh() throws LicenseNotaryException, IOException, CertificateException, NoSuchAlgorithmException {
    if (this.yww == null) {
      String str = getKeyStoreParam().getAlias();
      KeyStore keyStore = zts();
      try {
        if (((getKeyStoreParam().getKeyPwd() != null)) != keyStore.isKeyEntry(str))
          throw new LicenseNotaryException(vnt, str); 
        Certificate certificate = keyStore.getCertificate(str);
        if (certificate == null)
          throw new LicenseNotaryException(fku, str); 
        this.yww = certificate.getPublicKey();
      } catch (KeyStoreException keyStoreException) {
        throw new AssertionError(keyStoreException);
      } 
    } 
    return this.yww;
  }
  
  protected Signature ajd() {
    try {
      return Signature.getInstance(kjq);
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      throw new AssertionError(noSuchAlgorithmException);
    } 
  }
  
  protected KeyStore zts() throws IOException, CertificateException, NoSuchAlgorithmException {
    if (this.age != null)
      return this.age; 
    BufferedInputStream bufferedInputStream = null;
    try {
      this.age = KeyStore.getInstance(ynq);
      bufferedInputStream = new BufferedInputStream(this.ylu.getStream(), 5120);
      this.age.load(bufferedInputStream, getKeyStoreParam().getStorePwd().toCharArray());
    } catch (KeyStoreException keyStoreException) {
      throw new AssertionError(keyStoreException);
    } finally {
      try {
        bufferedInputStream.close();
      } catch (Exception exception) {}
    } 
    return this.age;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\pnd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */