package codeguard.licensing;

import java.beans.ExceptionListener;
import java.lang.reflect.UndeclaredThrowableException;

final class klp implements ExceptionListener {
  public void exceptionThrown(Exception paramException) {
    throw (paramException instanceof UndeclaredThrowableException) ? (UndeclaredThrowableException)paramException : new UndeclaredThrowableException(paramException);
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\klp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */