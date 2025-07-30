package de.schlichtherle.license;

import codeguard.licensing.qeu;
import java.beans.DefaultPersistenceDelegate;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

public class LicenseContent implements Serializable, Cloneable {
  private static final long vep = 1L;
  
  private X500Principal yiu;
  
  private X500Principal pnd;
  
  private String eui;
  
  private Date pej;
  
  private Date pwn;
  
  private Date ifr;
  
  private String bxh;
  
  private int ajd = 1;
  
  private String zts;
  
  private Object chr;
  
  private transient PropertyChangeSupport baj;
  
  protected Object clone() {
    try {
      LicenseContent licenseContent = (LicenseContent)super.clone();
      licenseContent.pej = (Date)this.pej.clone();
      licenseContent.pwn = (Date)this.pwn.clone();
      licenseContent.ifr = (Date)this.ifr.clone();
      return licenseContent;
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      throw new AssertionError(cloneNotSupportedException);
    } 
  }
  
  public X500Principal getHolder() {
    return this.yiu;
  }
  
  public synchronized void setHolder(X500Principal paramX500Principal) {
    X500Principal x500Principal = this.yiu;
    this.yiu = paramX500Principal;
    firePropertyChange("holder", x500Principal, paramX500Principal);
  }
  
  public X500Principal getIssuer() {
    return this.pnd;
  }
  
  public synchronized void setIssuer(X500Principal paramX500Principal) {
    X500Principal x500Principal = this.pnd;
    this.pnd = paramX500Principal;
    firePropertyChange("issuer", x500Principal, paramX500Principal);
  }
  
  public String getSubject() {
    return this.eui;
  }
  
  public synchronized void setSubject(String paramString) {
    String str = this.eui;
    this.eui = paramString;
    firePropertyChange("subject", str, paramString);
  }
  
  public Date getIssued() {
    return this.pej;
  }
  
  public void setIssued(Date paramDate) {
    Date date = this.pej;
    this.pej = paramDate;
    firePropertyChange("issued", date, paramDate);
  }
  
  public Date getNotBefore() {
    return this.pwn;
  }
  
  public void setNotBefore(Date paramDate) {
    Date date = this.pwn;
    this.pwn = paramDate;
    firePropertyChange("notBefore", date, paramDate);
  }
  
  public Date getNotAfter() {
    return this.ifr;
  }
  
  public void setNotAfter(Date paramDate) {
    Date date = this.ifr;
    this.ifr = paramDate;
    firePropertyChange("notAfter", date, paramDate);
  }
  
  public String getConsumerType() {
    return this.bxh;
  }
  
  public void setConsumerType(String paramString) {
    String str = this.bxh;
    this.bxh = paramString;
    firePropertyChange("consumerType", str, paramString);
  }
  
  public int getConsumerAmount() {
    return this.ajd;
  }
  
  public void setConsumerAmount(int paramInt) {
    int i = this.ajd;
    this.ajd = paramInt;
    firePropertyChange("consumerAmount", new Integer(i), new Integer(paramInt));
  }
  
  public String getInfo() {
    return this.zts;
  }
  
  public void setInfo(String paramString) {
    String str = this.zts;
    this.zts = paramString;
    firePropertyChange("info", str, paramString);
  }
  
  public Object getExtra() {
    return this.chr;
  }
  
  public void setExtra(Object paramObject) {
    Object object = this.chr;
    this.chr = paramObject;
    firePropertyChange("extra", object, paramObject);
  }
  
  public int hashCode() {
    return getConsumerAmount() + itm(getConsumerType()) + itm(getHolder()) + itm(getInfo()) + itm(getIssued()) + itm(getIssuer()) + itm(getNotAfter()) + itm(getNotBefore()) + itm(getSubject());
  }
  
  private static int itm(Object paramObject) {
    return (null == paramObject) ? 0 : paramObject.hashCode();
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof LicenseContent))
      return false; 
    LicenseContent licenseContent = (LicenseContent)paramObject;
    return (licenseContent.getConsumerAmount() == getConsumerAmount() && itm(licenseContent.getConsumerType(), getConsumerType()) && itm(licenseContent.getHolder(), getHolder()) && itm(licenseContent.getInfo(), getInfo()) && itm(licenseContent.getIssued(), getIssued()) && itm(licenseContent.getIssuer(), getIssuer()) && itm(licenseContent.getNotAfter(), getNotAfter()) && itm(licenseContent.getNotBefore(), getNotBefore()) && itm(licenseContent.getSubject(), getSubject()));
  }
  
  private static boolean itm(Object paramObject1, Object paramObject2) {
    return (paramObject1 == paramObject2 || (null != paramObject1 && paramObject1.equals(paramObject2)));
  }
  
  public final synchronized void addPropertyChangeListener(PropertyChangeListener paramPropertyChangeListener) {
    if (this.baj == null)
      this.baj = new PropertyChangeSupport(this); 
    this.baj.addPropertyChangeListener(paramPropertyChangeListener);
  }
  
  public final synchronized void removePropertyChangeListener(PropertyChangeListener paramPropertyChangeListener) {
    if (this.baj == null)
      return; 
    this.baj.removePropertyChangeListener(paramPropertyChangeListener);
  }
  
  protected final void firePropertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    if (this.baj == null)
      return; 
    this.baj.firePropertyChange(paramPropertyChangeEvent);
  }
  
  protected final void firePropertyChange(String paramString, Object paramObject1, Object paramObject2) {
    if (this.baj == null)
      return; 
    this.baj.firePropertyChange(paramString, paramObject1, paramObject2);
  }
  
  static {
    qeu.itm(X500Principal.class, new DefaultPersistenceDelegate(new String[] { "name" }));
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\de\schlichtherle\license\LicenseContent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */