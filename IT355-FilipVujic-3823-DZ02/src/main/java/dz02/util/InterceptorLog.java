/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz02.util;

import dz02.Main;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 *
 * @author filip
 */
@EnableAspectJAutoProxy
@Aspect
@Component
public class InterceptorLog {
    
    public static Logger logger = LoggerFactory.getLogger(InterceptorLog.class);
    
    @Before("execution(* dz02.service.Pas*.run*(..))")
    public void before() {
        logger.info("Calling method.");
    }
    
    @After("execution(* dz02.service.Ovca*.run*(..))")
    public void after() {
        logger.info("Finished method.");
    }
    
    @AfterThrowing("execution(* dz02.service.*.run*(..))")
    public void afterThrowing() {
        logger.info("Method threw an exception.");
    }
    
    @AfterReturning("execution(* dz02.service.*.run*(..))")
    public void afterReturning() {
        logger.info("Method returned a value.");
    }
    
    @Around("execution(* dz02.service.Kokoska*.run*(..))")
    public void around() {
        logger.info("This is called around the method.");
    }
}
