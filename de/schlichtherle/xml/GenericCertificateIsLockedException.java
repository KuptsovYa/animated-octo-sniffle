package de.schlichtherle.xml;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;

public class GenericCertificateIsLockedException extends PropertyVetoException {
  public GenericCertificateIsLockedException(PropertyChangeEvent paramPropertyChangeEvent) {
    super(paramPropertyChangeEvent.getPropertyName(), paramPropertyChangeEvent);
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\de\schlichtherle\xml\GenericCertificateIsLockedException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */