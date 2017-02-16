package com.learn.java;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		int found = 0;
		int not_found = 0;
		
		if(len1 == len2){
			int len = len1;
			for(int i=0; i<len; i++){
				found = 0;
				for(int j=0; j<len; j++){
					if(str1.charAt(i) == str2.charAt(j)){
						found=1;
						break;
					}
				}
				if(found==0){
					not_found=1;
					break;
				}
			}
			if(not_found==1){
				System.out.println("Strings are Not Anagrams to Each Other..!!");
			}
			else
				System.out.println("Strings are Anagrams");
		}
		else
        {
            System.out.print("Both Strings Must have the same number of Character to be an Anagram");
        }    
	}
}
