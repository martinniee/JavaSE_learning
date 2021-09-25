package com.nathan.nencapsulation;

/**
 * @author nathan
 * @create 2021-09-19-16:10
 **/
public class TestAccount {

    public static void main(String[] args) {
        // 使用类 Account
        Account account = new Account();
        account.setName("jack");
        account.setBalance(60);
        account.setPassword("123456");
        account.showInfo();
    }


}
