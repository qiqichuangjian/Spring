package com.cglib;

import com.jdk.Car;
import com.jdk.XiaoMing;
import net.sf.cglib.proxy.Enhancer;

public class TestCglib {
//    SpringAOP的核心   动态代理
    public static void main(String[] args) {

        CglibProxy cglib = new CglibProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(XiaoMing.class);
        enhancer.setCallback(cglib);
        Car car = (Car) enhancer.create();
        car.mai();
        car.work();
    }
}
