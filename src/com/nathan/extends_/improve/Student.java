package com.nathan.extends_.improve;

/**
 * @author nathan
 * @create 2021-09-19-17:19
 **/
/*
 父类Student是 Pupil和graduate的共同父类
 */
public class Student {
    // 共有属性
    public String name;
    public int age;
    private double score; // 成绩不被透露

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    // 自定义showInfo方法
    public  void showInfo(){
        System.out.println(" 学生名 " + name + " 学生年龄 " + age + " 学生成绩 " + score);
    }
}
