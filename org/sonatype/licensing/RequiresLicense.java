package org.sonatype.licensing;

import com.google.inject.BindingAnnotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.sonatype.licensing.feature.Feature;

@Retention(RetentionPolicy.RUNTIME)
@BindingAnnotation
@Target({ElementType.METHOD})
public @interface RequiresLicense {
  Class<? extends Feature>[] features();
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensing\RequiresLicense.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */