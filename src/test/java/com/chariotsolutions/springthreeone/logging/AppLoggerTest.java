package com.chariotsolutions.springthreeone.logging;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

/**
 * User: gordondickens
 * Date: 1/4/12
 * Time: 3:41 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class AppLoggerTest {
    private static final Logger logger = LoggerFactory.getLogger(AppLoggerTest.class);

    @Autowired
    SimpleBeanWithAppLogger simpleBeanWithAppLogger;

    @Test
    public void testLogger() {
        assertNotNull("Bean MUST exist", simpleBeanWithAppLogger);
        assertNotNull("Message MUST have a value", simpleBeanWithAppLogger.getSimpleMessage());
        assertFalse("Message MUST not be empty", simpleBeanWithAppLogger.getSimpleMessage().isEmpty());
        
        logger.debug("RESULT {}", simpleBeanWithAppLogger.toString());
    }

}
