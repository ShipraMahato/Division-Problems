package com.edu;

import java.util.Scanner;

public class Example1 {
	
	// Write a program to find the number is divisible or not if it is not  
	// divisible than find the next number to be completely divisible.
		public static void main(String[] args) {
			int a,b,c,d;
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the value to be divide ");
			a = scanner.nextInt();
			System.out.println("Enter the value divided by ");
			b = scanner.nextInt();
			
			c=a%b;
			
			if (c==0)
			{
			
				System.out.println("The number is divisible by "+ b);
			}
			else
				System.out.println("The number is not divisible by b");
			
				c = a % b;
				d = b - c;
				System.out.println("The next number divisible by b is : " + (a+d));
		
		
		}

	}


