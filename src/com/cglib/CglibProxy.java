package com.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


public class CglibProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("开始监听....");
        Object invokeSuper = methodProxy.invokeSuper(o, args);
        System.out.println("结束监听....");

        return invokeSuper;
    }

}
