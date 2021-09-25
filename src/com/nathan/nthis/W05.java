package com.nathan.nthis;

/**
 * @author nathan
 * @create 2021-09-11-20:06
 **/

/*
【练习05】

定义一个圆类Circle,定义属性: 半径,提供显示圆周长的方法,提供显示圆面积的方法。


 */
public class W05 {
    public static void main(String[] args) {
        Circle cr = new Circle();
        cr.getArea(4);
        cr.getCircu(3);
    }
}

class Circle{
    float radius;
    float area;
    float PI = 3.14f;

    public void getArea(float radius){
        System.out.println("The area of circle is :" + radius*radius*PI );
    }
    public void getCircu(float radius){
        System.out.println("The Circumsference of circle is :" + 2*radius*PI );
    }
}