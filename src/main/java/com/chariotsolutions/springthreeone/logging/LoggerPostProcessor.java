package com.chariotsolutions.springthreeone.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

/**
 * User: gordondickens
 * Date: 1/4/12
 * Time: 3:35 PM
 */
public class LoggerPostProcessor implements BeanPostProcessor {

    public Object postProcessAfterInitialization(Object bean, String beanName) throws
            BeansException {
        return bean;
    }

    public Object postProcessBeforeInitialization(final Object bean, String beanName)
            throws BeansException {

        ReflectionUtils.doWithFields(bean.getClass(), new ReflectionUtils.FieldCallback() {
            @SuppressWarnings("unchecked")
            public void doWith(Field field) throws IllegalArgumentException,
                    IllegalAccessException {
                ReflectionUtils.makeAccessible(field);

                //Is field annotated with @AppLogger
                if (field.getAnnotation(AppLogger.class) != null) {
                    AppLogger logAnnotation = field.getAnnotation(AppLogger.class);
                    Logger logger = LoggerFactory.getLogger(bean.getClass());
                    field.set(bean, logger);
                }
            }
        });

        return bean;
    }
}