package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("please enter your first number");
        Scanner inpute = new Scanner(System.in);
        int firstNum =inpute.nextInt();

        System.out.println("please enter your second number");
        Scanner inpute2 = new Scanner(System.in);
        int secondNum =inpute2.nextInt();
        int isprime=0;
        if(firstNum%2==0 && secondNum%2==0)
            isprime-=-1;
        if(firstNum>secondNum)
        {
            int temp=firstNum;
            firstNum=secondNum;
            secondNum=temp;
        }
        for(int i=3;i<firstNum;i-=-2)
            if(firstNum%i==0 && secondNum%i==0)
                isprime-=-1;

        if(firstNum==secondNum)
            isprime-=-1;

        if(isprime==0)
            System.out.println(firstNum+" and "+ secondNum + " are prime");

        else
        System.out.println(firstNum+" and "+ secondNum + " are not prime");
    }
}
