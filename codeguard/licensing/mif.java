package codeguard.licensing;

import de.schlichtherle.license.LicenseContent;
import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class mif extends SimpleBeanInfo {
  private static BeanDescriptor qyf = null;
  
  private static final int qeu = 0;
  
  private static final int klp = 1;
  
  private static final int ysn = 2;
  
  private static final int zhj = 3;
  
  private static final int rnn = 4;
  
  private static final int bos = 5;
  
  private static final int zsv = 6;
  
  private static final int aec = 7;
  
  private static final int whz = 8;
  
  private static final int agq = 9;
  
  private static EventSetDescriptor[] haa = null;
  
  private static MethodDescriptor[] bjw = null;
  
  private static final int aua = -1;
  
  private static final int omz = -1;
  
  private static BeanDescriptor itm() {
    return qyf;
  }
  
  private static PropertyDescriptor[] omj() {
    PropertyDescriptor[] arrayOfPropertyDescriptor = new PropertyDescriptor[10];
    try {
      arrayOfPropertyDescriptor[0] = new PropertyDescriptor("consumerAmount", LicenseContent.class, "getConsumerAmount", "setConsumerAmount");
      arrayOfPropertyDescriptor[1] = new PropertyDescriptor("consumerType", LicenseContent.class, "getConsumerType", "setConsumerType");
      arrayOfPropertyDescriptor[2] = new PropertyDescriptor("extra", LicenseContent.class, "getExtra", "setExtra");
      arrayOfPropertyDescriptor[3] = new PropertyDescriptor("holder", LicenseContent.class, "getHolder", "setHolder");
      arrayOfPropertyDescriptor[4] = new PropertyDescriptor("info", LicenseContent.class, "getInfo", "setInfo");
      arrayOfPropertyDescriptor[5] = new PropertyDescriptor("issued", LicenseContent.class, "getIssued", "setIssued");
      arrayOfPropertyDescriptor[6] = new PropertyDescriptor("issuer", LicenseContent.class, "getIssuer", "setIssuer");
      arrayOfPropertyDescriptor[7] = new PropertyDescriptor("notAfter", LicenseContent.class, "getNotAfter", "setNotAfter");
      arrayOfPropertyDescriptor[8] = new PropertyDescriptor("notBefore", LicenseContent.class, "getNotBefore", "setNotBefore");
      arrayOfPropertyDescriptor[9] = new PropertyDescriptor("subject", LicenseContent.class, "getSubject", "setSubject");
    } catch (IntrospectionException introspectionException) {
      introspectionException.printStackTrace();
    } 
    return arrayOfPropertyDescriptor;
  }
  
  private static EventSetDescriptor[] zxn() {
    return haa;
  }
  
  private static MethodDescriptor[] clk() {
    return bjw;
  }
  
  public BeanDescriptor getBeanDescriptor() {
    return itm();
  }
  
  public PropertyDescriptor[] getPropertyDescriptors() {
    return omj();
  }
  
  public EventSetDescriptor[] getEventSetDescriptors() {
    return zxn();
  }
  
  public MethodDescriptor[] getMethodDescriptors() {
    return clk();
  }
  
  public int getDefaultPropertyIndex() {
    return -1;
  }
  
  public int getDefaultEventIndex() {
    return -1;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\mif.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */