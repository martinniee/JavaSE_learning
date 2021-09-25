package com.nathan.nmodifier;

/**
 * @author nathan
 * @create 2021-09-16-22:08
 **/
public class A {
//    以修饰 变量属性 为例,说明访问权限修饰符
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void m1(){
        /*
        在同一类中,可以访问public protected 默认 private修饰的属性和方法
         */
        System.out.println("m1()执行了");
        System.out.println("n1=" + n1 +"\t"+ "n2=" + n2 + "\t" + "n3=" + n3 + "\t" + "n4=" + n4);

    }
}
