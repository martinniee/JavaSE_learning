package com.nathan.extends_;

/**
 * @author nathan
 * @create 2021-09-19-16:50
 **/
public class Pupil {
    // 定义属性
    public String name;
    public int age;
    private double score; // 成绩不被透露

    //get,set方法
    public void setScore(double score) {
        this.score = score;
    }

    // 自定义方法 testing 进行考试
    public void testing(){
        System.out.println("小学生 " + name + "正在考小学数学");
    }

    // 自定义showInfo方法
    public  void showInfo(){
        System.out.println("学生名 " + name + "学生年龄 " + age + "学生成绩 " + score);
    }

}
