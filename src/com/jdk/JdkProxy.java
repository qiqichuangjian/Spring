package com.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Acthor:孙琪; date:2019/4/16;
 */
public class JdkProxy implements InvocationHandler {

    private Object object;

    public JdkProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始执行");

        Object invoke = method.invoke(object, args);

        System.out.println("结束执行");
        return invoke;
    }
}
