#  Adding of two numbers
# This is java program
# TRY TRY!!
# python >>> java	
# java code 
Program list
	# Always give comment

import java.util.Scanner; // Import the Scanner class
# This is java import statement

public class MyClass {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Type a number:");
        x = myObj.nextInt(); // Read user input

        System.out.println("Type another number:");
        y = myObj.nextInt(); // Read user input

        sum = x + y;
        System.out.println("Sum is: " + sum); // Output user input
    }
}

Module -2 
 
// Java program for simple calculator

import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class BasicCalculator {

	public static void main(String[] args)
	{
		// stores two numbers
		double num1, num2;

		// Take input from the user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers");

		// take the inputs
		num1 = sc.nextDouble();

		num2 = sc.nextDouble();

		System.out.println("Enter the operator (+,-,*,/)");

		char op = sc.next().charAt(0);

		double o = 0;

		switch (op) {

		// case to add two numbers
		case '+':

			o = num1 + num2;

			break;

		// case to subtract two numbers
		case '-':

			o = num1 - num2;

			break;

		// case to multiply two numbers
		case '*':

			o = num1 * num2;

			break;

		// case to divide two numbers
		case '/':

			o = num1 / num2;

			break;

		default:

			System.out.println("You enter wrong input");

			break;
		}

		System.out.println("The final result:");

		System.out.println();

		// print the final result
		System.out.println(num1 + " " + op + " " + num2
						+ " = " + o);
	}
}

Module - 3
	
	public class MultiplyExample {
   public static void main(String[] args) {
       int a;
       int b;
       int c;
       a = 5;
       b = 58;
       c = a*b; //integer number to keep the result of multiplication
       System.out.println("5*58 = " + c);
   }
}
