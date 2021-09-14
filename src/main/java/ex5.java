/*
 *   UCF COP 3330 Fall 2021 Assignment 1 Solution
 *   Copyright 2021 Christina Mutz
 *
 *   Exercise 5 solution
 */
import java.util.Scanner;

public class ex5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the first number?");   //prompt the user for input
        var num1 = sc.nextInt();

        System.out.println("What is the second number?");
        var num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));   // in separate lines show the sum, difference, product,and quotient of the numbers
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
    }

}
