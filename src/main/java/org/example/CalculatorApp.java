package org.example;

import java.util.Scanner;
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2;
        double result = 0;

        System.out.print("Enter Number 1: ");
        num1 = sc.nextDouble();

        System.out.print("Enter Number 2: ");
        num2 = sc.nextDouble();

        System.out.print("Enter the Operator (+,-,*,/) : ");
        char operator = sc.next().charAt(0);

        switch (operator){
            // addition of two numbers
            case '+':
                result = num1 + num2;
                break;
            // subtraction of two numbers
            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                 break;
            default:
                System.out.println("You enter wrong input");
        }


        System.out.print("Final Result: " + num1 + " operator " + num2 + " = " + result);

    }
}
