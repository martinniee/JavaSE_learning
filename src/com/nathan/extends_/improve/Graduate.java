package com.nathan.extends_.improve;

/**
 * @author nathan
 * @create 2021-09-19-17:26
 **/

// 让Graduate继承Student
public class Graduate extends  Student{
    // 自定义方法 testing 进行考试
    // 大学生独有
    public void testing(){
        System.out.println("大学生 " + name + "正在考小学数学");
    }

}
