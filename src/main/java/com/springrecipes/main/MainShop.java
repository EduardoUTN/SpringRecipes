package com.springrecipes.main;

import com.springrecipes.sequence.SequenceGenerator;
import com.springrecipes.shop.Battery;
import com.springrecipes.shop.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainShop {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans-shop.xml");

        Product aaa = (Product) context.getBean("aaa");
        Product cdrw = (Product) context.getBean("cdrw");

        System.out.println(aaa);
        System.out.println(cdrw);
    }
}
