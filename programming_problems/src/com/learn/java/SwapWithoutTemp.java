package com.learn.java;

import java.util.Scanner;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a+"--"+b);
		
		//Another way
		
		a = a*b;
		b = a/b;
		a = a/b;
		
		System.out.println(a+"--"+b);
		
		//Another way
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println(a+"--"+b);
		

	}

}