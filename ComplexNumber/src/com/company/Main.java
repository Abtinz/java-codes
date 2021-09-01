package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	   System.out.println("please enter the realNumber and intellectualNumber of first number");
	   Scanner input = new Scanner(System.in);
	   int firstNumRealNumber =input.nextInt();
        Scanner input1 = new Scanner(System.in);
        int firstNumIntellectualNumber =input1.nextInt();
        ComplexNumber firstNum = new ComplexNumber(firstNumRealNumber, firstNumIntellectualNumber);
        //ComplexNumber firstNum = new ComplexNumber(firstNumRealNumber);
        //ComplexNumber firstNum = new ComplexNumber();

        System.out.println("please enter the realNumber and intellectualNumber of second number");
        Scanner input2 = new Scanner(System.in);
        int secondNumRealNumber =input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        int secondNumIntellectualNumber =input3.nextInt();
        ComplexNumber secondNum = new ComplexNumber(secondNumRealNumber, secondNumIntellectualNumber);
        //secondNum = new ComplexNumber(secondNumRealNumber);
        // ComplexNumber secondNum = new ComplexNumber();
        ComplexNumber resultNum = new ComplexNumber();
        while (1==1)
        {
            System.out.println("1) Sum(+)");
            System.out.println("2) Minus(-)");
            System.out.println("3) Multiplication(*)");
            System.out.println("4) Division(/)");
            System.out.println("else : Exit(#)");
            Scanner input4 = new Scanner(System.in);
            int choice =input4.nextInt();
            if(choice == 1)
            {
               System.out.println(resultNum.toprintsum(firstNum.getRealNumber(),firstNum.getIntellectualNumber(),secondNum.getRealNumber(),secondNum.getIntellectualNumber()));
            }
            else if(choice == 2)
            {
                System.out.println(resultNum.toprintminus(firstNum.getRealNumber(),firstNum.getIntellectualNumber(),secondNum.getRealNumber(),secondNum.getIntellectualNumber()));
            }
            else if(choice == 3)
            {
                System.out.println(resultNum.toprintMultipy(firstNum.getRealNumber(),firstNum.getIntellectualNumber(),secondNum.getRealNumber(),secondNum.getIntellectualNumber()));
            }
            else if(choice == 4)
            {
                System.out.println(resultNum.toprintDivision(firstNum.getRealNumber(),firstNum.getIntellectualNumber(),secondNum.getRealNumber(),secondNum.getIntellectualNumber()));
            }
            else
               break;
        }
        System.out.println("good bye ^_^");

    }
}
