package com.chariotsolutions.springthreeone.logging;

import org.slf4j.Logger;

/**
 * User: gordondickens
 * Date: 1/4/12
 * Time: 3:44 PM
 */
public class SimpleBeanWithAppLogger {
    String simpleMessage;

    @AppLogger
    private Logger logger;

    public String getSimpleMessage() {
        return simpleMessage;
    }

    public void setSimpleMessage(String simpleMessage) {
        // Can't log here because, logging is injected as a post processor
        // logger.debug("Setting Message '{}'", simpleMessage);
        this.simpleMessage = simpleMessage;
    }

    @Override
    public String toString() {
        String returnMe = "SimpleBeanWithAppLogger{" +
                "simpleMessage='" + simpleMessage + '\'' +
                '}';
        logger.debug("toString Message '{}'", returnMe);
        return returnMe;
    }

    public Logger getLogger() {
        return logger;
    }
}
