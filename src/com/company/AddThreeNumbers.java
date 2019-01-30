package com.company;

import java.util.Scanner;

public class AddThreeNumbers{

    public static void main(String[] args) {

        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter a number");
        int num1 = keyboard.nextInt();

        System.out.println("Enter a number");
        int num2 = keyboard.nextInt();

        System.out.println("Enter a number");
        int num3 = keyboard.nextInt();


        int sum;

        sum= num1 +num2 +num3;

        System.out.println("Total = " + sum);

    }

}
