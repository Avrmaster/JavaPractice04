package com.leskivprod;

import com.leskivprod.annotations.PerformerMaximilian;
import com.leskivprod.annotations.PerformerOleksandr;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.leskivprod.annotations")
public class AppConfig {

    @Bean
    public PerformerOleksandr normPerformer() {
        return new PerformerOleksandr();
    }

    @Bean
    public PerformerMaximilian neNormPerformer() {
        return new PerformerMaximilian();
    }
}
