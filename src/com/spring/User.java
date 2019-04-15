package com.spring;

public class User {
    // IOC 控制反转  将控制权交个Spring

    private Integer id;
    private String name;
    private Integer age;
    // int 和Integer区别：int 基本数据类型，默认值是0； Integer是引用数据类型，默认是null


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
