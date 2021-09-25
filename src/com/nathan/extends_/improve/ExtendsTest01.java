package com.nathan.extends_.improve;

/**
 * @author nathan
 * @create 2021-09-19-17:28
 **/
public class ExtendsTest01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "赛罗";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(50);
        pupil.showInfo();

        System.out.println("===========");
        Graduate graduate = new Graduate();
        graduate.name = "泰罗";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();

    }
}
