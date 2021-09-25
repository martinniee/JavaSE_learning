package com.nathan.nencapsulation;

/**
 * @author nathan
 * @create 2021-09-19-15:53
 **/


/*
    要求:
        创建程序,其中定义两个类 Account和AccountTest体会java封装性
        1、Account类要求有属性: 姓名(长度为2,3或4位,余额必须>20,，，密码必须是6位
        如不满足,则提示,并给默认值
        2、通过setXxx方法给Account的属性赋值
        3、在AccountTest中测试
 */

public class Account {

    // 定义数据,为了封装,都设置为private
    private String name;
    private double balance;
    private String password;


    // 提供两个构造器


    public Account() {
    }

    public Account(String name, double balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 对姓名进行数据验证
        // 当姓名字符长度介于 2~6之间,则合法赋值,否则提示信息。
        if (name.length() >= 2 && name.length() <=6){
            this.name = name;
        }else {
            System.out.println("姓名( 长度为2到6个字符之间)");
            this.name = "无名";// 设置默认值
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        // 余额要>20
        if (balance > 20 ){
            this.balance = balance;
        }else {
            System.out.println("余额要>20,默认为0");
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        // 密码必须是6位
        if (password.length() == 6){
            this.password = password;
        }else {
            System.out.println("密码必须是6位,默认为000000");
            this.password = "000000";
        }

    }
    // 定义方法显示账号信息
    public void showInfo(){
        // 可增加权限的校验
        System.out.println("账号信息:\n" +" name=" + name + "\n balance=" + balance + "\n password=" + password );
    }
}
