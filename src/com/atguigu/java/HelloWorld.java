package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HelloWorld {



    public static void main(String[] args) {
        System.out.println("hellowoq!!");

        System.out.println("helloworl!!");
        method1();
    }
    public static void method1(){

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
