package codeguard.licensing;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import org.codehaus.plexus.util.xml.pull.MXSerializer;
import org.codehaus.plexus.util.xml.pull.XmlSerializer;

public class omz {
  private static final String uca = null;
  
  public void itm(Writer paramWriter, agq paramagq) throws IOException {
    MXSerializer mXSerializer = new MXSerializer();
    mXSerializer.setProperty("http://xmlpull.org/v1/doc/properties.html#serializer-indentation", "  ");
    mXSerializer.setProperty("http://xmlpull.org/v1/doc/properties.html#serializer-line-separator", "\n");
    mXSerializer.setOutput(paramWriter);
    mXSerializer.startDocument(paramagq.rnn(), null);
    itm(paramagq, "nexusLicenseContent", (XmlSerializer)mXSerializer);
    mXSerializer.endDocument();
  }
  
  public void itm(OutputStream paramOutputStream, agq paramagq) throws IOException {
    MXSerializer mXSerializer = new MXSerializer();
    mXSerializer.setProperty("http://xmlpull.org/v1/doc/properties.html#serializer-indentation", "  ");
    mXSerializer.setProperty("http://xmlpull.org/v1/doc/properties.html#serializer-line-separator", "\n");
    mXSerializer.setOutput(paramOutputStream, paramagq.rnn());
    mXSerializer.startDocument(paramagq.rnn(), null);
    itm(paramagq, "nexusLicenseContent", (XmlSerializer)mXSerializer);
    mXSerializer.endDocument();
  }
  
  private void itm(whz paramwhz, String paramString, XmlSerializer paramXmlSerializer) throws IOException {
    paramXmlSerializer.startTag(uca, paramString);
    if (paramwhz.getId() != null)
      paramXmlSerializer.startTag(uca, "id").text(paramwhz.getId()).endTag(uca, "id"); 
    paramXmlSerializer.endTag(uca, paramString);
  }
  
  private void itm(agq paramagq, String paramString, XmlSerializer paramXmlSerializer) throws IOException {
    paramXmlSerializer.startTag(uca, paramString);
    if (paramagq.aec() != null)
      paramXmlSerializer.startTag(uca, "version").text(paramagq.aec()).endTag(uca, "version"); 
    if (paramagq.isFreeLicense())
      paramXmlSerializer.startTag(uca, "freeLicense").text(String.valueOf(paramagq.isFreeLicense())).endTag(uca, "freeLicense"); 
    if (paramagq.getLicensedUsers() != -1)
      paramXmlSerializer.startTag(uca, "licensedUsers").text(String.valueOf(paramagq.getLicensedUsers())).endTag(uca, "licensedUsers"); 
    if (paramagq.isEvaluation())
      paramXmlSerializer.startTag(uca, "evaluation").text(String.valueOf(paramagq.isEvaluation())).endTag(uca, "evaluation"); 
    if (paramagq.bos() != null && paramagq.bos().size() > 0) {
      paramXmlSerializer.startTag(uca, "products");
      for (bjw bjw : paramagq.bos())
        itm(bjw, "product", paramXmlSerializer); 
      paramXmlSerializer.endTag(uca, "products");
    } 
    if (paramagq.zhj() != null && paramagq.zhj().size() > 0) {
      paramXmlSerializer.startTag(uca, "features");
      for (whz whz : paramagq.zhj())
        itm(whz, "feature", paramXmlSerializer); 
      paramXmlSerializer.endTag(uca, "features");
    } 
    if (paramagq.getKeys() != null && paramagq.getKeys().size() > 0) {
      paramXmlSerializer.startTag(uca, "keys");
      for (haa haa : paramagq.getKeys())
        itm(haa, "key", paramXmlSerializer); 
      paramXmlSerializer.endTag(uca, "keys");
    } 
    if (paramagq.zsv() != null && paramagq.zsv().size() > 0) {
      paramXmlSerializer.startTag(uca, "properties");
      for (aua aua : paramagq.zsv())
        itm(aua, "property", paramXmlSerializer); 
      paramXmlSerializer.endTag(uca, "properties");
    } 
    paramXmlSerializer.endTag(uca, paramString);
  }
  
  private void itm(haa paramhaa, String paramString, XmlSerializer paramXmlSerializer) throws IOException {
    paramXmlSerializer.startTag(uca, paramString);
    if (paramhaa.getPassword() != null)
      paramXmlSerializer.startTag(uca, "password").text(paramhaa.getPassword()).endTag(uca, "password"); 
    if (paramhaa.getEntry() != null)
      paramXmlSerializer.startTag(uca, "entry").text(paramhaa.getEntry()).endTag(uca, "entry"); 
    if (paramhaa.whz() != null)
      paramXmlSerializer.startTag(uca, "type").text(paramhaa.whz()).endTag(uca, "type"); 
    paramXmlSerializer.endTag(uca, paramString);
  }
  
  private void itm(bjw parambjw, String paramString, XmlSerializer paramXmlSerializer) throws IOException {
    paramXmlSerializer.startTag(uca, paramString);
    if (parambjw.getId() != null)
      paramXmlSerializer.startTag(uca, "id").text(parambjw.getId()).endTag(uca, "id"); 
    paramXmlSerializer.endTag(uca, paramString);
  }
  
  private void itm(aua paramaua, String paramString, XmlSerializer paramXmlSerializer) throws IOException {
    paramXmlSerializer.startTag(uca, paramString);
    if (paramaua.agq() != null)
      paramXmlSerializer.startTag(uca, "key").text(paramaua.agq()).endTag(uca, "key"); 
    if (paramaua.haa() != null)
      paramXmlSerializer.startTag(uca, "value").text(paramaua.haa()).endTag(uca, "value"); 
    paramXmlSerializer.endTag(uca, paramString);
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\omz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */