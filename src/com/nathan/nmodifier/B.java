package com.nathan.nmodifier;

/**
 * @author nathan
 * @create 2021-09-16-22:22
 **/
public class B {

    protected void say(){
        A a = new A();
/*
  在同包下,可以访问的权限有 public , protected, 默认
  不能访问的是 private 修饰的属性和方法
 */
        System.out.println("say()执行了");
        System.out.println("n1=" + a.n1  +"\t" + "n2=" + a.n2  +"\t" + "n3=" + a.n3 );
        a.m1();
    }
}
