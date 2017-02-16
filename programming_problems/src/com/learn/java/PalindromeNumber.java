package com.learn.java;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num, reverse=0, temp;		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		temp=num;
		while(num!=0){
			reverse = reverse*10 + num%10;
			num = num/10;
		}
		if(temp==reverse){
			System.out.println(temp +" is palindrome");
		}
		else{
			System.out.println(temp +" is not palindrome");
		}

	}

}
