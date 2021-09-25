package com.nathan.extends_;

import java.lang.reflect.Array;

/**
 * @author nathan
 * @create 2021-09-20-12:16
 **/

//Sub是子类subclass继承父类Base
// 鼠标悬浮到(子)类上,按键盘 Ctrl + H 可查看继承关系结构
public class Sub extends Base {

    // 构造器
    public Sub() {
        super("hellen");
        System.out.println("sub()......");
    }
    public Sub(String name){
        super(); //调用父类无参构造器 ( 也可不写 )
        System.out.println("sub(String name )......");
    }
    // 子类独有方法
    public void sayOk(){
        // 非私有的属性和方法可以被子类直接使用
        // 私有的属性和方法不能被子类直接直接直接使用
        System.out.println(n1 + " " + n2 + " " + n3  );
        test100();
        test200();
        test300();
        // test2400(); // ⚠️直接访问父类私有方法报错。
        // 使用父类非私有方法 间接间接间接 访问私有属性
        System.out.println("n4= " + getPrivateFiledN4());
//        Array.getFloat();
    }

}

