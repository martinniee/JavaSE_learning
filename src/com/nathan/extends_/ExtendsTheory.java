package com.nathan.extends_;

/**
 * @author nathan
 * @create 2021-09-25-14:04
 **/
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son(); // 执行到这句话时,在内存中的原理是什么 →按照查找关系返回信息
        System.out.println("name=" + son.name);
        //System.out.println("name=" + son.age); // 不能直接访问父类private属性
        System.out.println("name=" + son.getAge());
        /*
        		关系逻辑:
		1. 查看这个变量在子类中是否存在
		2. 如果子类存在这个属性存在,并且子类可以访问,则返回信息。
		3. 如果子类中没有这个属性,则到其父类中查看是否存在此属性( 如果父类存在且可访问,则返回信息)
		4. 如果父类没有就按照(3)的规则,继续往上查看父类的父类,直到Object。

         */
    }
}

// 爷爷类

class GrandPa{
    String name = "大头爷爷";
    String hobby = "旅游";
}

// 爸爸类
class Father extends GrandPa{
    String name = "大头爸爸" ;
    private int age = 39;
    // 定义一个public的方法使子类可以间接的访问父类中的private属性
    public int getAge() {
        System.out.print("使用父类的public方法getAge获取private属性值: ");
        return age;
    }
}

// 儿子
class Son extends Father{
    String name = "大头儿子";
}
