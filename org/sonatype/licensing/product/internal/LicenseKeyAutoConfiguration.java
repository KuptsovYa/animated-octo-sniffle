package org.sonatype.licensing.product.internal;

import java.util.Map;

import org.sonatype.licensing.LicenseKey;
import org.sonatype.licensing.feature.Feature;
import org.sonatype.licensing.feature.Features;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Scope;

@AutoConfiguration
public class LicenseKeyAutoConfiguration {

    @Bean
    public Features features(Map<String, Feature> featureMap) {
        return new Features(featureMap);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public LicenseKey licenseKey(Features features) {
        return new DefaultLicenseKey(features);
    }
}