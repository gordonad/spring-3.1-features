package com.chariotsolutions.springthreeone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * User: gordondickens
 * Date: 1/3/12
 * Time: 6:16 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class MyEnvironmentTest {
    private static final Logger logger = LoggerFactory.getLogger(MyEnvironmentTest.class);
    
    @Autowired
    MyEnvironment myEnvironment;

    @Test
    public void testEnvironment() {
        logger.debug("My Environment Details {}", myEnvironment.toString());
    }
}
