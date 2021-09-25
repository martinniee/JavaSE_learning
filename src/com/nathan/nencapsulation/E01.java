package com.nathan.nencapsulation;

/**
 * @author nathan
 * @create 2021-09-18-21:26
 **/
public class E01 {
    public static void main(String[] args) {
        Person person = new Person();
//        person.name = "nathan"; // 公开的属性可以直接修改
       // person.setName("jack"); // 使用封装来修改属性(值)
//        person.setName("nathan");
//        person.setName("nathan");
        // person.age = 3000; // ⚠ 私有的属性能不能直接修改,需通过方法修改
//        person.setAge(30);
//        person.setSalary(3000); // 使用封装修改属性(值)
//        System.out.println(person.info());
        //System.out.println(person.salary); // 不能随便直接查看工资
//        System.out.println(person.getSalary()); // 使用封装来访问属性

        //使用构造器赋值属性
        Person smith = new Person("smith",2000,50000);
        System.out.println("==========smith的信息========");
        System.out.println(smith.info());




    }
}
class Person{
    // 定义属性
    public String name; // 公开
    private int age; // 私有
    private double salary; //私有


    public Person() {
    }
//    有三个属性的构造器
    public Person(String name, int age, double salary) {
        // 使用构造器的时对数据验证( 使用setXxx() )
        setName(name);
        setAge(age);
        setSalary(salary);
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
    }

    // 定义方法 set,get 使用快捷键 Alter + Insert
    // 根据需求完善代码
    public String getName() {
        return name;
    }
    public void setName(String name) {
        //对数据进行验证, 判断当名字满足条件(>2 && <8)才修改值,否则进行相应处理
        if (name.length() > 2 && name.length() < 8){
            this.name = name;
        }else {
            System.out.println("something wrong with the name you entered,please check it again!");
            System.out.println("The shortest length of the name is at least 6 characteies");
        }

    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        // 对数据进行验证, 当传入的age符合条件( 1~120)才修改age值 [条件]
        if (age >= 1 && age <=120){
            this.age = age;
        }else {
            //异常处理,当传入的age不满足条件的措施
            System.out.println("你输入的age不满足条件,请确认后重新输入!(默认年龄18岁)");
            this.age = 18;
        }

    }
    public double getSalary() {
        // 对数据进行验证,当传入的对象身份符合时才查看工资,否则提示
        if (this.name.equals("nathan")){
            return salary;
        }else {
            System.out.println("Permission not allowed, illegal access ");
            return 0;
        }
    }
    public void setSalary(double salary) {
        this.salary = salary;
        System.out.println("current value has turned into: " + salary);
    }
    // 新增方法 : 返回属性信息
    public String info(){
        return "信息为 \n name= " + name + "\n 年龄为= " + age + "\n 工资为=" + salary;
    }
}