package com.nathan.extends_.improve;

/**
 * @author nathan
 * @create 2021-09-19-17:20
 **/

// 让Pupil继承Student


public class Pupil extends Student {
    // 自定义方法 testing 进行考试
    // 小学生
    public void testing(){
        System.out.println("小学生 " + name + "正在考小学数学");
    }

}
