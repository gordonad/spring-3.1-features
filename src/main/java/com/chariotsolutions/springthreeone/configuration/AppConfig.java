package com.chariotsolutions.springthreeone.configuration;

import com.chariotsolutions.springthreeone.SimpleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class AppConfig {
    @Bean
    public SimpleBean simpleBean() {
        SimpleBean simpleBean = new SimpleBean();
        simpleBean.setMyString("Ripped Pants");
        return simpleBean;
    }
}
