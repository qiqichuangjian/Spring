package com.java.controller;

/**
 * @Acthor:孙琪; date:2019/4/18;
 */
//由小到大
public class A {
    public static void main(String[] args) {
        int a=45;
        int b=66;
        int c=13;
        int max=0;
        int mid=0;
        int min=0;
        max=a>b?(a>c?a:c):(b>c?b:c);
        min=a<b?(a<c?a:c):(b<c?b:c);
        //mid=a>b?(a>c?(b>c?b:c):a):(b>c?(a>c?a:c):b);
        mid=(max==a)?(b>c?b:c):((max==b)?(a>c?a:c):(a>b?a:b));
        System.out.println(min+"\t"+mid+"\t"+max);

    }
}
