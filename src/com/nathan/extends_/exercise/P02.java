package com.nathan.extends_.exercise;

/**
 * @author nathan
 * @create 2021-09-25-18:00
 **/
public class P02 {
    public static void main(String[] args) {
        C c = new C(); // 执行main方法会输出什么
    }
}

class A{
    public A(){
        System.out.println("我是A类");
    }

}

class  B extends  A{
    public B(){
        System.out.println("我是B类的无参构造");
    }
    public B(String name) {
        // super(); // 此时有默认的
        System.out.println("我是B类的有参构造");
    }
}
class C extends B{
    public C(){
        this("hello");
        System.out.println("我是C类的无参构造");
    }
    public C(String name){
        super("haha");
        System.out.println("我是C类的有参构造");
    }
}

