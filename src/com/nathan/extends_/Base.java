package com.nathan.extends_;

/**
 * @author nathan
 * @create 2021-09-20-12:11
 **/

//Base是父类 superclass

public class Base {

    // 定义属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400; // 注意此时n4是私有属性

    // 构造方法 (无参数)
    public  Base() {
        System.out.println("base().....");
    }
    public Base(String name){
        System.out.println("Base(String name)......");
    }
    // 提供一个可被子类访问的方法用于返回父类中的私有属性
    public  int getPrivateFiledN4(){
        return n4;
    }
    // 共有方法
    public void test100() {
        System.out.println("test100()......");
    }

    // 受保护方法
    protected void test200() {
        System.out.println("test200()......");
    }

    // 默认方法
    void test300() {
        System.out.println("test300()......");
    }
    private void test400(){
        System.out.println("test400()......");

    }

}
