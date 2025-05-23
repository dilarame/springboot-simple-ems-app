package net.javaguides.springboot.service.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
    
    @Before("execution(* net.javaguides.springboot.service.impl.*.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Before method call >>>>>>");
    }
}
