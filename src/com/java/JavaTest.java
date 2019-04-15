package com.java;

public class JavaTest {


    // 主管功能:将控制权交个主管
    public static void main(String[] args) {
        JavaWork javaWork =  new JavaWork();
        //这边new谁，就是谁测试代码
        javaWork.setTester(new LiSi());
        javaWork.doTest();
    }

}
