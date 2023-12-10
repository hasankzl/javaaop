package org.example;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* org.example.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp){
      //  System.out.println(  jp.getSignature());
        String arg =jp.getArgs()[0].toString();
        System.out.println("before logger with arg: "+arg);
    }

    @After("execution(* *.*.*.checkout(..))")
    public void afterLogger(){
        System.out.println("after logger");
    }

    @Pointcut("execution(* org.example.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){}

    @AfterReturning(pointcut = "afterReturningPointCut()",returning = "retVal")
    public void afterReturning(Integer retVal){
        System.out.println("after returning value is : " + retVal);
    }
}
