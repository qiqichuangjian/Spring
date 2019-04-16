package com.xml;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Acthor:孙琪; date:2019/4/16;
 */
public class AOP {
    public void before(){
        System.out.println("xml前置通知");
    }
    public void after(){
        System.out.println("xml后置通知");
    }
    public void runtime(){
        System.out.println("xml运行通知");
    }
    public void throwing(){
        System.out.println("xml异常通知");
    }
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("xml环绕通知前");
        proceedingJoinPoint.proceed();
        System.out.println("xml环绕通知后");
    }
}
