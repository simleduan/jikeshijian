package com.springAnnotation.beanlifecycle;import org.springframework.beans.BeansException;import org.springframework.beans.factory.config.BeanPostProcessor;/** * 初始化前后 */public class MyBeanPostProcessor implements BeanPostProcessor {    @Override    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {        System.out.println("postProcessBeforeInitialization    -->"+beanName);        return bean;    }    @Override    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {        System.out.println("postProcessAfterInitialization    -->"+beanName);        return bean;    }}