package com.nathan.nthis;

/**
 * @author nathan
 * @create 2021-09-11-18:13
 **/

/*
【练习03】
编写类Book,定义方法updatePrice,实现更改某本书的价格,
具体: 如果价格>150,则更改为150,如果价格>100,则更改为100,否则不变。
 */
public class W03 {
    //将 Book类作为自己的属性
    W03 Book;


    public static void main(String[] args) {
        W03 w03 = new W03();
        Book book = new Book(123);
        w03.updatePrice(book.price);
    }

    public void updatePrice(float price ){

        if (price > 150){
            price = 150;
            System.out.println("price=" + price);
        }
        else if (price > 100){
            price = 100;
            System.out.println("price=" + price);
        }

    }

}

class Book{
    float price ;

    Book(float price){
        this.price = price;
    }

}
