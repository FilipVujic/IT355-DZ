/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz02.util;

import dz02.Main;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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
    
    //@Pointcut("dz02.util.Zivotinja+")
    @Before("execution(* run*(..))")
    public void before() {
        logger.info("Calling run method.");
    }
    
    @After("execution(* dz02.service.*Service.run*(..))")
    public void after() {
        logger.info("Finished run method.");
    }
    
    public void afterThrowing() {
        logger.info("Method showStudent() threw an exception.");
    }
    
    public void afterReturning() {
        logger.info("Method showStudent() returned a value.");
    }
    
    public void around() {
        logger.info("This is called around showStudent() method.");
    }
}
