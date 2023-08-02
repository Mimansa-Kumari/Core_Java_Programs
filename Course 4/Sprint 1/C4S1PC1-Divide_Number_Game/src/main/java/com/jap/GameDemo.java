package com.jap;

import java.util.Scanner;
public class GameDemo {

    public String divideByNumber(int firstNumber, int secondNumber){
        //create local variable
        int finalNumber = 0;
        try {
            //write logic
            finalNumber = firstNumber/secondNumber;

            //Handle specific exception
        }catch (ArithmeticException exception){
          return exception.toString();
        }
        return String.valueOf(finalNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int secondNumber = sc.nextInt();
        GameDemo gameDemo = new GameDemo();
        System.out.println(gameDemo.divideByNumber(firstNumber,secondNumber));
    }

}
