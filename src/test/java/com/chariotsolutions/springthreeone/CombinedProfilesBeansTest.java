package com.chariotsolutions.springthreeone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertNotNull;

/**
 * User: gordondickens
 * Date: 1/3/12
 * Time: 1:58 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@ActiveProfiles(profiles = {"dev", "prod"})
public class CombinedProfilesBeansTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void testDevBeans() {
        SimpleBean simpleBean = applicationContext.getBean("constructorBean", SimpleBean.class);
        assertNotNull(simpleBean);

        SimpleBean prodBean = applicationContext.getBean("prodBean", SimpleBean.class);
        assertNotNull(prodBean);
    }

}
