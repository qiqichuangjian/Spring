package com.java;

public class JavaWork {

    private Tester tester;

    public void setTester(Tester tester) {
        this.tester = tester;
    }

    public void doTest() {
        // 业务操作时，对象之间的耦合度高
        // ZhangSan zhangsan  = new ZhangSan();
        // zhangsan.test();
        tester.test();
    }
}
