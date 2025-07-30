package de.schlichtherle.xml;

import codeguard.licensing.qeu;
import codeguard.licensing.zhj;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import org.apache.commons.codec.binary.Base64;

public final class GenericCertificate implements zhj, Serializable {
  private static final long vep = 6247620498526484734L;
  
  private static final String cpa = "US-ASCII";
  
  private static final String evy = "US-ASCII/Base64";
  
  private transient boolean bcd;
  
  private String tpm;
  
  private String noa;
  
  private String ytv;
  
  private String ydd;
  
  private transient PropertyChangeSupport nlo;
  
  private transient VetoableChangeSupport dcg;
  
  public GenericCertificate() {}
  
  public GenericCertificate(GenericCertificate paramGenericCertificate) {
    try {
      setEncoded(paramGenericCertificate.getEncoded());
      setSignature(paramGenericCertificate.getSignature());
      setSignatureAlgorithm(paramGenericCertificate.getSignatureAlgorithm());
      setSignatureEncoding(paramGenericCertificate.getSignatureEncoding());
    } catch (PropertyVetoException propertyVetoException) {
      throw new AssertionError(propertyVetoException);
    } 
  }
  
  public final synchronized void sign(Object paramObject, PrivateKey paramPrivateKey, Signature paramSignature) throws NullPointerException, GenericCertificateIsLockedException, PropertyVetoException, PersistenceServiceException, InvalidKeyException {
    if (paramPrivateKey == null)
      throw new NullPointerException("signingKey"); 
    if (paramSignature == null)
      throw new NullPointerException("signingEngine"); 
    PropertyChangeEvent propertyChangeEvent = new PropertyChangeEvent(this, "locked", Boolean.valueOf(isLocked()), Boolean.TRUE);
    if (isLocked())
      throw new GenericCertificateIsLockedException(propertyChangeEvent); 
    fireVetoableChange(propertyChangeEvent);
    try {
      byte[] arrayOfByte1 = qeu.zxn(paramObject);
      paramSignature.initSign(paramPrivateKey);
      paramSignature.update(arrayOfByte1);
      byte[] arrayOfByte2 = Base64.encodeBase64(paramSignature.sign());
      String str = new String(arrayOfByte2, 0, arrayOfByte2.length, "US-ASCII");
      setEncoded(new String(arrayOfByte1, "UTF-8"));
      setSignature(str);
      setSignatureAlgorithm(paramSignature.getAlgorithm());
      setSignatureEncoding("US-ASCII/Base64");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new AssertionError(unsupportedEncodingException);
    } catch (SignatureException signatureException) {
      throw new AssertionError(signatureException);
    } 
    this.bcd = true;
    firePropertyChange(propertyChangeEvent);
  }
  
  public final synchronized void verify(PublicKey paramPublicKey, Signature paramSignature) throws NullPointerException, GenericCertificateIsLockedException, PropertyVetoException, InvalidKeyException, SignatureException, GenericCertificateIntegrityException {
    if (paramPublicKey == null)
      throw new NullPointerException("verificationKey"); 
    if (paramSignature == null)
      throw new NullPointerException("verificationEngine"); 
    PropertyChangeEvent propertyChangeEvent = new PropertyChangeEvent(this, "locked", Boolean.valueOf(isLocked()), Boolean.TRUE);
    if (isLocked())
      throw new GenericCertificateIsLockedException(propertyChangeEvent); 
    fireVetoableChange(propertyChangeEvent);
    try {
      byte[] arrayOfByte1 = getEncoded().getBytes("UTF-8");
      paramSignature.initVerify(paramPublicKey);
      paramSignature.update(arrayOfByte1);
      byte[] arrayOfByte2 = Base64.decodeBase64(getSignature().getBytes("US-ASCII"));
      if (!paramSignature.verify(arrayOfByte2))
        throw new GenericCertificateIntegrityException(); 
      setSignatureAlgorithm(paramSignature.getAlgorithm());
      setSignatureEncoding("US-ASCII/Base64");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new AssertionError(unsupportedEncodingException);
    } 
    this.bcd = true;
    firePropertyChange(propertyChangeEvent);
  }
  
  public final boolean isLocked() {
    return this.bcd;
  }
  
  public Object getContent() throws GenericCertificateNotLockedException, PersistenceServiceException {
    if (!isLocked())
      throw new GenericCertificateNotLockedException(); 
    return qeu.zxn(getEncoded());
  }
  
  public final String getEncoded() {
    return this.tpm;
  }
  
  public synchronized void setEncoded(String paramString) throws GenericCertificateIsLockedException {
    if (paramString == null) {
      if (this.tpm == null)
        return; 
    } else if (paramString.equals(this.tpm)) {
      return;
    } 
    PropertyChangeEvent propertyChangeEvent = new PropertyChangeEvent(this, "encoded", getEncoded(), paramString);
    if (isLocked())
      throw new GenericCertificateIsLockedException(propertyChangeEvent); 
    this.tpm = paramString;
    firePropertyChange(propertyChangeEvent);
  }
  
  public final String getSignature() {
    return this.noa;
  }
  
  public synchronized void setSignature(String paramString) throws GenericCertificateIsLockedException {
    if (paramString == null) {
      if (this.noa == null)
        return; 
    } else if (paramString.equals(this.noa)) {
      return;
    } 
    PropertyChangeEvent propertyChangeEvent = new PropertyChangeEvent(this, "signature", getSignature(), paramString);
    if (isLocked())
      throw new GenericCertificateIsLockedException(propertyChangeEvent); 
    this.noa = paramString;
    firePropertyChange(propertyChangeEvent);
  }
  
  public final String getSignatureAlgorithm() {
    return this.ytv;
  }
  
  public synchronized void setSignatureAlgorithm(String paramString) throws GenericCertificateIsLockedException {
    if (paramString == null) {
      if (this.ytv == null)
        return; 
    } else if (paramString.equals(this.ytv)) {
      return;
    } 
    PropertyChangeEvent propertyChangeEvent = new PropertyChangeEvent(this, "signatureAlgorithm", getSignatureAlgorithm(), paramString);
    if (isLocked())
      throw new GenericCertificateIsLockedException(propertyChangeEvent); 
    this.ytv = paramString;
    firePropertyChange(propertyChangeEvent);
  }
  
  public final String getSignatureEncoding() {
    return this.ydd;
  }
  
  public synchronized void setSignatureEncoding(String paramString) throws GenericCertificateIsLockedException {
    if (paramString == null) {
      if (this.ydd == null)
        return; 
    } else if (paramString.equals(this.ydd)) {
      return;
    } 
    PropertyChangeEvent propertyChangeEvent = new PropertyChangeEvent(this, "signatureEncoding", getSignatureEncoding(), paramString);
    if (isLocked())
      throw new GenericCertificateIsLockedException(propertyChangeEvent); 
    this.ydd = paramString;
    firePropertyChange(propertyChangeEvent);
  }
  
  public final synchronized void addVetoableChangeListener(VetoableChangeListener paramVetoableChangeListener) {
    if (this.dcg == null)
      this.dcg = new VetoableChangeSupport(this); 
    this.dcg.addVetoableChangeListener(paramVetoableChangeListener);
  }
  
  public final void removeVetoableChangeListener(VetoableChangeListener paramVetoableChangeListener) {
    if (this.dcg == null)
      return; 
    this.dcg.removeVetoableChangeListener(paramVetoableChangeListener);
  }
  
  protected final void fireVetoableChange(PropertyChangeEvent paramPropertyChangeEvent) throws PropertyVetoException {
    if (this.dcg == null)
      return; 
    this.dcg.fireVetoableChange(paramPropertyChangeEvent);
  }
  
  public final synchronized void addPropertyChangeListener(PropertyChangeListener paramPropertyChangeListener) {
    if (this.nlo == null)
      this.nlo = new PropertyChangeSupport(this); 
    this.nlo.addPropertyChangeListener(paramPropertyChangeListener);
  }
  
  public final void removePropertyChangeListener(PropertyChangeListener paramPropertyChangeListener) {
    if (this.nlo == null)
      return; 
    this.nlo.removePropertyChangeListener(paramPropertyChangeListener);
  }
  
  protected final void firePropertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    if (this.nlo == null)
      return; 
    this.nlo.firePropertyChange(paramPropertyChangeEvent);
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\de\schlichtherle\xml\GenericCertificate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */