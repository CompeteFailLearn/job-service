package com.example.spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    // will act as finally
    @Before("execution(* com.example.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.example.spring_boot_rest.service.JobService.updateJob(..))")  //return type, class-name.method-name(args)
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method called " + jp.getSignature().getName());
    }

    // will act as finally
    @After("execution(* com.example.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.example.spring_boot_rest.service.JobService.updateJob(..))")  //return type, class-name.method-name(args)
    public void logMethodExecuted(JoinPoint jp){
        LOGGER.info("Method called " + jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.example.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.example.spring_boot_rest.service.JobService.updateJob(..))")  //return type, class-name.method-name(args)
    public void logMethodExecutionSuccess(JoinPoint jp){
        LOGGER.info("Method executed successfully " + jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.example.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.example.spring_boot_rest.service.JobService.updateJob(..))")  //return type, class-name.method-name(args)
    public void logMethodCrash(JoinPoint jp){
        LOGGER.info("Method called " + jp.getSignature().getName());
    }
}
