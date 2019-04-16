package com.java;

/**
 * @Acthor:孙琪; date:2019/4/16;
 */
public class Proxy implements Car{
//静态代理   手动代理
    private ZhangSan zhangSan;

    public void setZhangSan(ZhangSan zhangSan) {
        this.zhangSan = zhangSan;
    }

    @Override
    public void mai() {
        System.out.println("准备买车");
        zhangSan.mai();
        System.out.println("买车结束");
    }
}
