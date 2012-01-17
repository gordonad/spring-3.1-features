package com.chariotsolutions.springthreeone.configuration;

import com.chariotsolutions.springthreeone.SimpleBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
@ActiveProfiles(profiles = "dev")
public class BeanConfigTest {

    @Autowired
    SimpleBean simpleBean;

    @Test
    public void testBeanAvailablity() {
        assertNotNull(simpleBean);
    }


}
