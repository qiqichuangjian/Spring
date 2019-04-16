package com.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;

// 不属于dao service controller
@Component
//AOP 的切面注解版
@Aspect
public class AnnotationAOP {
    @Autowired
    private TransactionUtil transactionUtil;
    private TransactionStatus begin;
    // execution 执行的方程式：方法返回值类型  包名.类名.方法名(..) 参数   *所有类名，*所有方法名
    @Before("execution(* com.service.*.*(..))")
    public void before(){
        System.out.println("前置通知");
    }
    @After("execution(* com.service.*.*(..))")
    public void after(){
        System.out.println("后置通知");
    }
    @AfterReturning("execution(* com.service.*.*(..))")
    public void runtime(){
        System.out.println("运行通知");
    }
    @AfterThrowing("execution(* com.service.*.*(..))")
    public void throwing(){
        System.out.println("异常通知");//异常通知后进行回滚
        transactionUtil.rollback(begin);
        System.out.println("事务回滚");
    }
    @Around("execution(* com.service.*.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        begin = transactionUtil.begin();
        System.out.println("事务开启");
        System.out.println("环绕通知前");
        //对执行方法进行放行的语句
        proceedingJoinPoint.proceed();
        System.out.println("环绕通知后");
        transactionUtil.commit(begin);
        System.out.println("事务提交");
    }
}
