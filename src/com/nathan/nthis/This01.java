package com.nathan.nthis;

public class This01 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("大壮", 3);
        dog1.info();
        Dog dog2 = new Dog("小弱", 22);
        dog2.info();
        dog1.info();
    }
}

class Dog { //类
    String name = "nathan";
    int age = 22;

    public Dog(String name, int age) { //自定义构造器
        this.name = name;
        this.age = age;
        System.out.println("this.name: " + this.name);
    }

    public void info() {
        System.out.println(name + "\t" + age + "\t");
    }
}