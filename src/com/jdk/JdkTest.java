package com.jdk;


import java.lang.reflect.Proxy;

/**
 * @Acthor:孙琪; date:2019/4/16;
 */
public class JdkTest {

    public static void main(String[] args) {
        XiaoMing xiaoMing = new XiaoMing();
        JdkProxy jdkProxy =  new JdkProxy(xiaoMing);
        Car car = (Car)Proxy.newProxyInstance(xiaoMing.getClass().getClassLoader(),
                xiaoMing.getClass().getInterfaces(),jdkProxy);
        car.mai();
        car.work();
    }
}
