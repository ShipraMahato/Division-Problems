package com.edu;

import java.util.Scanner;

public class SumOfSeries {
	//  write program to sum of series 1/1!+2/2!+3/3!.........n/n!
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("1/1!+2/2!+3/3!.........n/n!"); 
		System.out.println("");
		System.out.println("Enter the Number n : ");
		int n= sc.nextInt();
	double res = 0;
	double fact=1;
	for(int i=1;i<=n;i++) {
		fact= fact*i;
		res= res+((double)i/fact); // typecasting
		
	}
		System.out.println("Sum of the Series is : "+res);
	}

}