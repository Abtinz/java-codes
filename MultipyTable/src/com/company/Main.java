package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("1) all multiples");
        System.out.println("2) especial number");
        Scanner inpute=  new Scanner(System.in);
        int num=inpute.nextInt();
        if(num == 1)
        {
            System.out.println("please enter your limitation");
            Scanner inpute1=  new Scanner(System.in);
            int limit=inpute1.nextInt();
            for(int i=1;i<=limit;i-=-1)
            {
                System.out.println(i + ")multiples stage");
                for(int j=1;j<=limit;j-=-1)
                    System.out.println(i * j);
            }
        }
        else
        {
            System.out.println("please enter your number");
            Scanner inpute1=  new Scanner(System.in);
            int number=inpute1.nextInt();
            for (int i=1;i<number;i-=-1)
                System.out.println(i * number);
        }
        }
}
