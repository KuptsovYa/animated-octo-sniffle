package codeguard.licensing;

import de.schlichtherle.xml.PersistenceServiceException;
import java.beans.Encoder;
import java.beans.ExceptionListener;
import java.beans.PersistenceDelegate;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.HashMap;
import java.util.Map;

public class qeu implements zhj {
  private static final HashMap sxg = new HashMap<Object, Object>();
  
  public static int quo = 10240;
  
  private static final ExceptionListener ysn() {
    return new klp();
  }
  
  public static final synchronized void itm(Class<?> paramClass, PersistenceDelegate paramPersistenceDelegate) {
    sxg.put(paramClass, paramPersistenceDelegate);
  }
  
  protected static synchronized void itm(Encoder paramEncoder) {
    for (Map.Entry entry : sxg.entrySet())
      paramEncoder.setPersistenceDelegate((Class)entry.getKey(), (PersistenceDelegate)entry.getValue()); 
  }
  
  public static void itm(Object paramObject, OutputStream paramOutputStream) throws NullPointerException, PersistenceServiceException {
    if (paramOutputStream == null)
      throw new NullPointerException(); 
    try {
      BufferedOutputStream bufferedOutputStream = null;
      XMLEncoder xMLEncoder = null;
      try {
        bufferedOutputStream = new BufferedOutputStream(paramOutputStream, quo);
        xMLEncoder = new XMLEncoder(bufferedOutputStream);
        itm(xMLEncoder);
        xMLEncoder.setExceptionListener(ysn());
        if (paramObject != null) {
          synchronized (paramObject) {
            xMLEncoder.writeObject(paramObject);
          } 
        } else {
          xMLEncoder.writeObject(paramObject);
        } 
      } finally {
        if (xMLEncoder != null) {
          try {
            xMLEncoder.close();
          } catch (Throwable throwable) {
            bufferedOutputStream.close();
            throw throwable;
          } 
        } else if (bufferedOutputStream != null) {
          bufferedOutputStream.close();
        } else {
          paramOutputStream.close();
        } 
      } 
    } catch (UndeclaredThrowableException undeclaredThrowableException) {
      throw new PersistenceServiceException(undeclaredThrowableException.getCause());
    } catch (Throwable throwable) {
      throw new PersistenceServiceException(throwable);
    } 
  }
  
  public static void itm(Object paramObject, File paramFile) throws NullPointerException, PersistenceServiceException {
    if (paramFile == null)
      throw new NullPointerException(); 
    File file = null;
    boolean bool = false;
    try {
      file = zxn(paramFile);
      bool = paramFile.renameTo(file);
      itm(paramObject, new FileOutputStream(paramFile));
      if (bool)
        file.delete(); 
    } catch (Throwable throwable) {
      if (bool) {
        try {
          paramFile.delete();
        } catch (Throwable throwable1) {
          throwable = throwable1;
        } 
        try {
          file.renameTo(paramFile);
        } catch (Throwable throwable1) {
          throwable = throwable1;
        } 
      } 
      throw (throwable instanceof PersistenceServiceException) ? (PersistenceServiceException)throwable : new PersistenceServiceException(throwable);
    } 
  }
  
  private static File zxn(File paramFile) {
    String str = paramFile.getPath();
    while (true) {
      str = str + '~';
      File file = new File(str);
      if (!file.exists())
        return file; 
    } 
  }
  
  public static byte[] zxn(Object paramObject) throws PersistenceServiceException {
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      itm(paramObject, byteArrayOutputStream);
      return byteArrayOutputStream.toByteArray();
    } catch (PersistenceServiceException persistenceServiceException) {
      throw persistenceServiceException;
    } catch (Throwable throwable) {
      throw new PersistenceServiceException(throwable);
    } 
  }
  
  public static String clk(Object paramObject) throws PersistenceServiceException {
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      itm(paramObject, byteArrayOutputStream);
      return byteArrayOutputStream.toString("UTF-8");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new AssertionError(unsupportedEncodingException);
    } catch (PersistenceServiceException persistenceServiceException) {
      throw persistenceServiceException;
    } catch (Throwable throwable) {
      throw new PersistenceServiceException(throwable);
    } 
  }
  
  public static Object itm(InputStream paramInputStream) throws NullPointerException, PersistenceServiceException {
    if (paramInputStream == null)
      throw new NullPointerException(); 
    XMLDecoder xMLDecoder = null;
    try {
      xMLDecoder = new XMLDecoder(new BufferedInputStream(paramInputStream, quo), null, ysn(), new ysn());
      return xMLDecoder.readObject();
    } catch (UndeclaredThrowableException undeclaredThrowableException) {
      throw new PersistenceServiceException(undeclaredThrowableException.getCause());
    } catch (Throwable throwable) {
      throw new PersistenceServiceException(throwable);
    } finally {
      if (xMLDecoder != null)
        try {
          xMLDecoder.close();
        } catch (Throwable throwable) {
          throw new PersistenceServiceException(throwable);
        }  
    } 
  }
  
  public static Object clk(File paramFile) throws NullPointerException, PersistenceServiceException {
    if (paramFile == null)
      throw new NullPointerException(); 
    try {
      return itm(new FileInputStream(paramFile));
    } catch (PersistenceServiceException persistenceServiceException) {
      throw persistenceServiceException;
    } catch (Throwable throwable) {
      throw new PersistenceServiceException(throwable);
    } 
  }
  
  public static Object clk(byte[] paramArrayOfbyte) throws NullPointerException, PersistenceServiceException {
    if (paramArrayOfbyte == null)
      throw new NullPointerException(); 
    try {
      return itm(new ByteArrayInputStream(paramArrayOfbyte));
    } catch (PersistenceServiceException persistenceServiceException) {
      throw persistenceServiceException;
    } catch (Throwable throwable) {
      throw new PersistenceServiceException(throwable);
    } 
  }
  
  public static Object zxn(String paramString) throws NullPointerException, PersistenceServiceException {
    if (paramString == null)
      throw new NullPointerException(); 
    try {
      return clk(paramString.getBytes("UTF-8"));
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new AssertionError(unsupportedEncodingException);
    } catch (PersistenceServiceException persistenceServiceException) {
      throw persistenceServiceException;
    } catch (Throwable throwable) {
      throw new PersistenceServiceException(throwable);
    } 
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\qeu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */