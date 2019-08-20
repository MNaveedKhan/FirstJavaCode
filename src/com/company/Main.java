package com.company;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.next();
        System.out.print("Enter Any Number : ");
        int number = sc.nextInt();
        for(int i=0;i<number;i++)
        {
            System.out.println(name);
        }
        if(name.equals("Naveed"))
        {
            System.out.println("Welcome Naveed");
        }
        else
        {
            System.out.println("Sorry! Unauthorized Access");
        }

        System.out.println("_-_-_-_-_ TABLE GENERATOR _-_-_-_-_" + "\n");
        System.out.print("Enter Number For Table Generator : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number of Iterations : ");
        int num2 = sc.nextInt();
        if(num1>0 && num2>0)
        {
            int i = 1;
            while (i <= num2)
            {
                System.out.println(num1 + " X " + i + " = " + (num1*i));
                i++;
            }
        }
        else
        {
            System.out.println("Both the numbers must be greater than 0 !!!\n");
            main(args);
        }


        System.out.print("Enter First Number : ");
        int num3 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int num4 = sc.nextInt();
        int num5 = -5+8*6;

        System.out.println("Addition : " + (num3+num4));
        System.out.println("Subtraction : " + (num3-num4));
        System.out.println("Product : " + (num3*num4));
        System.out.println("Division : " + (num3/num4));
        System.out.println("Remainder : " + (num3%num4));
        System.out.println("Expression (-5+8*6) Solution : " + num5);


        System.out.print("Enter User Name : ");
        String user = sc.next();
        System.out.print("Enter User Password : ");
        String password = sc.next();
        System.out.println(login(user,password));
    }
        static String login(String user,String password)
        {
            String result = user.equals("Naveed")&& password.equals("123") ? "Login Successful" : "Access Denied";
            return result;
        }
}
