package codeguard.licensing;

import de.schlichtherle.license.LicenseContent;
import de.schlichtherle.license.LicenseContentException;
import de.schlichtherle.license.LicenseParamDe;
import de.schlichtherle.license.NoLicenseInstalledException;
import de.schlichtherle.xml.GenericCertificate;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.prefs.Preferences;
import javax.security.auth.x500.X500Principal;
import javax.swing.filechooser.FileFilter;

public class bab implements bao, pej {
  private static final long dyw = 1800000L;
  
  private static final String fvc;
  
  public static final String mpl;
  
  private static final String dpq;
  
  private static final String dvh;
  
  private static final String juq;
  
  private static final String xjx;
  
  protected static final String seo;
  
  private static final String ydu;
  
  private static final String djy;
  
  private static final String tpg;
  
  private static final String xlf;
  
  private static final String lsy;
  
  private static final String brx;
  
  private static final String mts;
  
  private static final String ndv;
  
  private static final String xae;
  
  private static final String rog;
  
  private static final String hep;
  
  private static final String ygy;
  
  private static final String jke;
  
  private static final String ajo;
  
  private static final String lpm;
  
  private LicenseParamDe ajw;
  
  private pnd xah;
  
  private ifr zoz;
  
  private GenericCertificate ldh;
  
  private long rjt;
  
  private FileFilter oaa;
  
  private Preferences mif;
  
  protected static Date rkn() {
    Calendar calendar = Calendar.getInstance();
    calendar.set(11, 0);
    calendar.set(12, 0);
    calendar.set(13, 0);
    calendar.set(14, 0);
    return calendar.getTime();
  }
  
  protected bab() {}
  
  public bab(LicenseParamDe paramLicenseParam) {
    omj(paramLicenseParam);
  }
  
  public LicenseParamDe eui() {
    return this.ajw;
  }
  
  public synchronized void itm(LicenseParamDe paramLicenseParam) {
    omj(paramLicenseParam);
  }
  
  private void omj(LicenseParamDe paramLicenseParam) {
    if (paramLicenseParam == null)
      throw new NullPointerException(dpq); 
    if (paramLicenseParam.getSubject() == null)
      throw new NullPointerException(dvh); 
    if (paramLicenseParam.getKeyStoreParam() == null)
      throw new NullPointerException(juq); 
    omj omj = paramLicenseParam.getCipherParam();
    if (omj == null)
      throw new NullPointerException(xjx); 
    pwn.chr().itm(omj.getKeyPwd());
    this.ajw = paramLicenseParam;
    this.xah = null;
    this.ldh = null;
    this.rjt = 0L;
    this.oaa = null;
    this.mif = null;
  }
  
  public final synchronized void itm(LicenseContent paramLicenseContent, File paramFile) throws Exception {
    itm(paramLicenseContent, yiu(), paramFile);
  }
  
  protected synchronized void itm(LicenseContent paramLicenseContent, pnd parampnd, File paramFile) throws Exception {
    zapisatChetVFile(itm(paramLicenseContent, parampnd), paramFile);
  }
  
  public final synchronized byte[] itm(LicenseContent paramLicenseContent) throws Exception {
    return itm(paramLicenseContent, yiu());
  }
  
  protected synchronized byte[] itm(LicenseContent paramLicenseContent, pnd parampnd) throws Exception {
    omj(paramLicenseContent);
    zxn(paramLicenseContent);
    GenericCertificate genericCertificate = parampnd.omj(paramLicenseContent);
    return pnd().zxn(genericCertificate);
  }
  
  public final synchronized LicenseContent itm(File paramFile) throws Exception {
    return itm(paramFile, yiu());
  }
  
  protected synchronized LicenseContent itm(File paramFile, pnd parampnd) throws Exception {
    return itm(omj(paramFile), parampnd);
  }
  
  protected synchronized LicenseContent itm(byte[] paramArrayOfbyte, pnd parampnd) throws Exception {
    GenericCertificate genericCertificate = pnd().zxn(paramArrayOfbyte);
    parampnd.omj(genericCertificate);
    LicenseContent licenseContent = (LicenseContent)genericCertificate.getContent();
    zxn(licenseContent);
    omj(paramArrayOfbyte);
    itm(genericCertificate);
    return licenseContent;
  }
  
  public final synchronized LicenseContent mif() throws Exception {
    return itm(yiu());
  }
  
  protected synchronized LicenseContent itm(pnd parampnd) throws Exception {
    GenericCertificate genericCertificate = bab();
    if (genericCertificate != null)
      return (LicenseContent)genericCertificate.getContent(); 
    byte[] arrayOfByte = vep();
    if (arrayOfByte == null)
      throw new NoLicenseInstalledException(eui().getSubject()); 
    genericCertificate = pnd().zxn(arrayOfByte);
    parampnd.omj(genericCertificate);
    LicenseContent licenseContent = (LicenseContent)genericCertificate.getContent();
    zxn(licenseContent);
    itm(genericCertificate);
    return licenseContent;
  }
  
  public final synchronized LicenseContent itm(byte[] paramArrayOfbyte) throws Exception {
    return omj(paramArrayOfbyte, yiu());
  }
  
  protected synchronized LicenseContent omj(byte[] paramArrayOfbyte, pnd parampnd) throws Exception {
    GenericCertificate genericCertificate = pnd().zxn(paramArrayOfbyte);
    parampnd.omj(genericCertificate);
    LicenseContent licenseContent = (LicenseContent)genericCertificate.getContent();
    zxn(licenseContent);
    return licenseContent;
  }
  
  public synchronized void bao() throws Exception {
    omj((byte[])null);
    itm((GenericCertificate)null);
  }
  
  protected synchronized void omj(LicenseContent paramLicenseContent) {
    if (paramLicenseContent.getHolder() == null)
      paramLicenseContent.setHolder(new X500Principal(ydu)); 
    if (paramLicenseContent.getSubject() == null)
      paramLicenseContent.setSubject(eui().getSubject()); 
    if (paramLicenseContent.getConsumerType() == null) {
      Preferences preferences = eui().getPreferences();
      if (preferences != null) {
        if (preferences.isUserNode()) {
          paramLicenseContent.setConsumerType(djy);
        } else {
          paramLicenseContent.setConsumerType(tpg);
        } 
        paramLicenseContent.setConsumerAmount(1);
      } 
    } 
    if (paramLicenseContent.getIssuer() == null)
      paramLicenseContent.setIssuer(new X500Principal(seo + eui().getSubject())); 
    if (paramLicenseContent.getIssued() == null)
      paramLicenseContent.setIssued(new Date()); 
    if (paramLicenseContent.getNotBefore() == null)
      paramLicenseContent.setNotBefore(rkn()); 
  }
  
  protected synchronized void zxn(LicenseContent paramLicenseContent) throws LicenseContentException {
    LicenseParamDe licenseParam = eui();
    if (!licenseParam.getSubject().equals(paramLicenseContent.getSubject()))
      throw new LicenseContentException(xlf); 
    if (paramLicenseContent.getHolder() == null)
      throw new LicenseContentException(lsy); 
    if (paramLicenseContent.getIssuer() == null)
      throw new LicenseContentException(brx); 
    if (paramLicenseContent.getIssued() == null)
      throw new LicenseContentException(mts); 
    Date date1 = new Date();
    Date date2 = paramLicenseContent.getNotBefore();
    if (date2 != null && date1.before(date2))
      throw new LicenseContentException(ndv); 
    Date date3 = paramLicenseContent.getNotAfter();
    if (date3 != null && date1.after(date3))
      throw new LicenseContentException(xae); 
    String str = paramLicenseContent.getConsumerType();
    if (str == null)
      throw new LicenseContentException(rog); 
    Preferences preferences = licenseParam.getPreferences();
    if (preferences != null && preferences.isUserNode()) {
      if (!djy.equalsIgnoreCase(str))
        throw new LicenseContentException(hep); 
      if (paramLicenseContent.getConsumerAmount() != 1)
        throw new LicenseContentException(ygy); 
    } else if (paramLicenseContent.getConsumerAmount() <= 0) {
      throw new LicenseContentException(jke);
    } 
  }
  
  protected GenericCertificate bab() {
    return (this.ldh != null && System.currentTimeMillis() < this.rjt + 1800000L) ? this.ldh : null;
  }
  
  protected synchronized void itm(GenericCertificate paramGenericCertificate) {
    this.ldh = paramGenericCertificate;
    this.rjt = System.currentTimeMillis();
  }
  
  protected byte[] vep() {
    return eui().getPreferences().getByteArray(fvc, null);
  }
  
  protected synchronized void omj(byte[] paramArrayOfbyte) {
    Preferences preferences = eui().getPreferences();
    if (paramArrayOfbyte != null) {
      preferences.putByteArray(fvc, paramArrayOfbyte);
    } else {
      preferences.remove(fvc);
    } 
  }
  
  protected static void zapisatChetVFile(byte[] paramArrayOfbyte, File paramFile) throws IOException {
    FileOutputStream fileOutputStream = new FileOutputStream(paramFile);
    try {
      fileOutputStream.write(paramArrayOfbyte);
    } finally {
      try {
        fileOutputStream.close();
      } catch (IOException iOException) {}
    } 
  }
  
  protected static byte[] omj(File paramFile) throws IOException {
    int i = Math.min((int)paramFile.length(), 1048576);
    byte[] arrayOfByte = new byte[i];
    FileInputStream fileInputStream = new FileInputStream(paramFile);
    try {
      fileInputStream.read(arrayOfByte);
    } finally {
      fileInputStream.close();
    } 
    return arrayOfByte;
  }
  
  protected synchronized pnd yiu() {
    if (this.xah == null)
      this.xah = new pnd(eui().getKeyStoreParam()); 
    return this.xah;
  }
  
  protected synchronized ifr pnd() {
    if (this.zoz == null)
      this.zoz = new ifr(eui().getCipherParam()); 
    return this.zoz;
  }
  
  public synchronized FileFilter pej() {
    if (this.oaa != null)
      return this.oaa; 
    String str = bxh.itm(ajo, eui().getSubject());
    if (File.separatorChar == '\\') {
      this.oaa = new vep(this, str);
    } else {
      this.oaa = new yiu(this, str);
    } 
    return this.oaa;
  }
  
  static {
    fvc = (new Obfuscator(new long[] { -2999492566024573771L, -1728025856628382701L })).toString();
    mpl = (new Obfuscator(new long[] { -7559156485370438418L, 5084921010819724770L })).toString();
    if (!axl && !mpl.equals(mpl.toLowerCase()))
      throw new AssertionError(); 
    dpq = pnd.dpq;
    dvh = (new Obfuscator(new long[] { -6788193907359448604L, -2787711522493615434L })).toString();
    juq = (new Obfuscator(new long[] { 4943981370588954830L, 8065447823433585419L, -2749528823549501332L })).toString();
    xjx = (new Obfuscator(new long[] { -3651048337721043740L, 1928803483347080380L, 1649789960289346230L })).toString();
    seo = (new Obfuscator(new long[] { 7165044359350484836L, -6008675436704023088L })).toString();
    ydu = seo + bxh.omj((new Obfuscator(new long[] { -883182015789302099L, 6587252612286394632L })).toString());
    djy = (new Obfuscator(new long[] { -6950934198262740461L, -10280221617836935L })).toString();
    tpg = (new Obfuscator(new long[] { -1441033263392531498L, 6113162389128247115L })).toString();
    xlf = (new Obfuscator(new long[] { -9211605111142713620L, 391714365510707393L, -7356761750428556372L, 6379560902598103028L })).toString();
    lsy = (new Obfuscator(new long[] { 7150026245468079143L, 6314884536402738366L, -1360923923476698800L })).toString();
    brx = (new Obfuscator(new long[] { -3034693013076752554L, -1011266899694033610L, 6775785917404597234L })).toString();
    mts = (new Obfuscator(new long[] { -6084371209004858580L, 3028840747031697166L, -3524637886726219307L })).toString();
    ndv = (new Obfuscator(new long[] { 5434633639502011825L, -3406117476263181371L, 6903673940810780388L, -6816911225052310716L })).toString();
    xae = (new Obfuscator(new long[] { 1000558500458715757L, -6998261911041258483L, -5490039629745846648L, 3561172928787106880L })).toString();
    rog = (new Obfuscator(new long[] { -3274088377466921882L, -1704115158449736962L, -1134622897105293263L, 2875630655915253859L })).toString();
    hep = (new Obfuscator(new long[] { -3559580260061340089L, 8807812719464926891L, 3255622466169980128L, 3208430498260873670L, 8772089725159421213L })).toString();
    ygy = (new Obfuscator(new long[] { 6854702630454082314L, -1676630527348424687L, 4853969635229547239L, -7087814313396201500L, 7133601245775504376L })).toString();
    jke = (new Obfuscator(new long[] { -5670394608177286583L, -3674104453170648872L, 4159301984262248157L, 7442355638167795990L, 4780252201915657674L })).toString();
    ajo = (new Obfuscator(new long[] { 3160933239845492228L, -2320904495012387647L, -5935185636215549881L, -3418607682842311949L })).toString();
    lpm = (new Obfuscator(new long[] { -6576160320308571504L, 7010427383913371869L })).toString();
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\bab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */