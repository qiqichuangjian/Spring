package com.java;

public class JavaWork {
    //准备一个测试员
    private Tester tester;
    //谁测试就放谁，这也是多态
    public void setTester(Tester tester) {
        this.tester = tester;
    }

    public void doTest() {
        // 业务操作时，对象之间的耦合度高，需要不断的改代码，所以业务层的控制权交给主管了
        // ZhangSan zhangsan  = new ZhangSan();
        // zhangsan.test();
        tester.test();
    }
}
