package com.Assignment_14;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_14 {
    public static void main(String[] args) {
        ApplicationContext ctxobj = new ClassPathXmlApplicationContext("applicationcontext.xml");
        Circle cj = (Circle) ctxobj.getBean("cibean");
        Square cj1 = (Square) ctxobj.getBean("sqbean");
        Rectangle cj2 = (Rectangle) ctxobj.getBean("recbean");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice");
        String ch = sc.next();
        switch (ch) {
        case "Circle":
            cj.area(11);
            cj.side();
            break;
        case "Square":
            cj1.area(5);
            cj1.side();
            break;
        case "Rectangle":
            cj2.area(2, 4);
            cj2.side();
            break;
        default:
            System.out.println("Enter valid");
        }
    }
}
