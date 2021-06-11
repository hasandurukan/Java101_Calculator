package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstNumber, secondNumber;

        System.out.print("Please type the first number :");
        firstNumber = input.nextDouble();

        System.out.print("Please type the second number :");
        secondNumber = input.nextDouble();

        System.out.print("+ for addition\n- for subtraction\n* for multiplication\n/ for division :");
        char operator = input.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            default:
                break;
        }

        System.out.print("Result is " + result);
    }
}
