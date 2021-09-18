package com.atguigu.java;


import com.atguigu.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author linxiaoxi
 * @date 2021/9/16 - 13:35
 */
public class TemplatesTest {
    //模板六：prsf ==> private static final
    private static final Customer CUST = new Customer();

    //同一类型 psf
    public static final int NUM=1;
    //psfi
    public static final int NUM2=1;
    //psfs
    public static final String NATION="china";
    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println("hello");
        //变形 soutp/soutm/soutv/xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        int num1=10;
        System.out.println("num1 = " + num1);
        int num2=20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);
        //模板三：fori
        String[] arr = new String[]{"Tom","Jerry","Hanmeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形 iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形 itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {
            
        }
        //变形 list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形 list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }
    
    public void method(){
        System.out.println("TemplatesTest.method");
        //模板五：ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        if (list == null) {
            
        }
        //变形：inn
        if (list != null) {

        }
        //变形：xxx.nn / xxx.null
        if (list == null) {

        }
        if (list != null) {

        }

    }
}
