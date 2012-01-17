package com.chariotsolutions.springthreeone.services;

import org.cloudfoundry.runtime.env.CloudEnvironment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;


public class CloudApplicationContextInitializer implements
        ApplicationContextInitializer<ConfigurableApplicationContext> {
    private static final Logger logger = LoggerFactory
            .getLogger(CloudApplicationContextInitializer.class);

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        CloudEnvironment env = new CloudEnvironment();
        if (env.getInstanceInfo() != null) {
            logger.info("Application running in cloud. API '{}'",
                    env.getCloudApiUri());
            // System.out.println("cloud API: " + env.getCloudApiUri());
            applicationContext.getEnvironment().setActiveProfiles("cloud");
            applicationContext.refresh();
        } else {
            logger.info("Application running local");
            applicationContext.getEnvironment().setActiveProfiles("local");
        }
    }
}