package com.chariotsolutions.springthreeone;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.StandardEnvironment;

import java.util.Properties;

/**
 * User: gordondickens
 * Date: 1/3/12
 * Time: 6:13 PM
 */
public class MyEnvironment {

    @Value("#{ systemProperties['user.language'] }")
    private String varOne;

    @Value("#{ systemProperties }")
    private Properties systemProperties;

    @Value("#{ systemEnvironment }")
    private Properties systemEnvironment;

    @Value("#{ environment }")
    private StandardEnvironment environment;

    @Override
    public String toString() {
        return "\n\n********************** MyEnvironment: ["
                + "\n\tsystemProperties=" + formatMe(systemProperties.toString())
                + ", \n\n\tsystemEnvironment=" + formatMe(systemEnvironment.toString())
                + ", \n\n\tenvironment=" + formatMe(environment.toString()) + "]";
    }
    
    private static final String formatMe(String in) {
        String out = in;
        out = in.replace("{", "{\n\t\t");
        out = out.replace(", ", "\n\t\t");
        
        return out;
    }


//    public String toReflectiveString() {
//        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
//    }
}