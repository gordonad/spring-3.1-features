package com.chariotsolutions.springthreeone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User: gordondickens
 * Date: 1/3/12
 * Time: 2:07 PM
 */
public class SimpleBean {
    private static final Logger logger = LoggerFactory.getLogger(SimpleBean.class);
    private String myString;
    private String myOtherString;

    public SimpleBean() {
    }

    public SimpleBean(String myString) {
        logger.debug("CONSTRUCTOR setting String to '{}'", myString);
        this.myString = myString;
    }

    public SimpleBean(String myString, String other) {
        logger.debug("CONSTRUCTOR setting String to '{}' and '{}'", myString, other);
        this.myString = myString;
        this.myOtherString = other;
    }

    public String getMyString() {
        return myString;
    }

    public String getMyOtherString() {
        return myOtherString;
    }

    public void setMyString(String myString) {
        logger.debug("SETTER setting String to '{}'", myString);
        this.myString = myString;
    }
}
