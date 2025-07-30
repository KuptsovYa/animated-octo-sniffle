package codeguard.licensing;

import com.sonatype.license.PlexusLicenseContent;
import java.io.File;
import java.util.Date;
import javax.security.auth.x500.X500Principal;
import org.sonatype.licensing.CustomLicenseContent;
import org.sonatype.licensing.LicenseKeyRequest;
import org.sonatype.licensing.ProductDetails;
import org.sonatype.licensing.util.LicensingUtil;

public abstract class bos extends rnn implements LicenseKeyRequest {
  public static final String CONSUMER_TYPE_USER = LicensingUtil.unobfuscate(new long[] { -5315844356430302770L, -3200891647243649522L });
  
  private File wab;
  
  private final ProductDetails xrw;
  
  public bos(ProductDetails paramProductDetails) {
    this.xrw = paramProductDetails;
  }
  
  public CustomLicenseContent getLicenseContent() {
    PlexusLicenseContent plexusLicenseContent = new PlexusLicenseContent();
    plexusLicenseContent.setSubject(this.xrw.getProductName());
    plexusLicenseContent.setIssuer(getIssuer());
    plexusLicenseContent.setIssued(new Date());
    plexusLicenseContent.setNotBefore(getEffectiveDate());
    plexusLicenseContent.setNotAfter(getExpirationDate());
    plexusLicenseContent.setHolder(getContactDetails());
    plexusLicenseContent.setIssuer(getIssuer());
    plexusLicenseContent.setConsumerType(CONSUMER_TYPE_USER);
    plexusLicenseContent.setExtra(getExtraContent());
    return (CustomLicenseContent)plexusLicenseContent;
  }
  
  public File getLicenseKeyFile() {
    return this.wab;
  }
  
  public void setLicenseKeyFile(File paramFile) {
    this.wab = paramFile;
  }
  
  protected X500Principal getContactDetails() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("CN=").append(LicensingUtil.encodeDNPart(getContactName())).append(", ");
    stringBuilder.append("OU=").append("").append(", ");
    stringBuilder.append("O=").append(LicensingUtil.encodeDNPart(getContactCompany())).append(", ");
    stringBuilder.append("UID=").append(LicensingUtil.encodeDNPart(getContactEmailAddress())).append(", ");
    stringBuilder.append("L=").append(LicensingUtil.encodeDNPart(getContactTelephone())).append(", ");
    stringBuilder.append("C=").append(LicensingUtil.encodeDNPart(getContactCountry()));
    return new X500Principal(stringBuilder.toString());
  }
  
  public abstract String getExtraContent();
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\bos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */