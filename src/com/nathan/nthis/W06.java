package com.nathan.nthis;

/**
 * @author nathan
 * @create 2021-09-11-20:13
 **/

/*
练习06】

编程创建一个Cacul计算类,在其中定义2个变量表示两个操作数,
定义四个方法实现求和,差,乘,商( 要求除数为0的话,要提示 )并创建两个对象,分别测试。
 */
public class W06 {
    public static void main(String[] args) {
        Cacul c = new Cacul();
        Cacul c1 = new Cacul();
        c.add(3,4);;
        c1.divi(3,0);
    }
}

class Cacul{

    double a,b;

    public void add(double a, double b){
        System.out.println("a+b= " + (this.a+this.b));
    }
    public void minus(double a, double b){
        System.out.println("a-b=" + (this.a-this.b));
    }
    public void multi(double a, double b){
        System.out.println("a*b=" + this.a*this.b);

    }
    public void divi(double a, double b){
        if(this.b == 0){
            System.out.println("除法分母不能为0");
        }
        System.out.println("a/b=" + this.a/this.b);

    }

}
