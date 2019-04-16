package com.java;

/**
 * @Acthor:孙琪; date:2019/4/16;
 */
public class JavaTest {
    public static void main(String[] args) {
//静态代理   手动代理    代理人给zhangSan办事
        ZhangSan zhangSan = new ZhangSan();
        Proxy proxy =  new Proxy();
        proxy.setZhangSan(zhangSan);
        proxy.mai();
    }
}
