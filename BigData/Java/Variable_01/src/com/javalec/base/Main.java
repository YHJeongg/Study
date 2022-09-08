package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		
		// 덧셈 
		System.out.println(2 + 3);
		
		// 뺄셈 
		System.out.println(2 - 3);
		
		// 곱셈  
		System.out.println(2 * 3);
		
		// 나눗셈 
		System.out.println(2.0 / 3);
		
		// 변수
		int num1 = 10;
		int num2 = 20;
		
		char character1 = 'a';
		String str1 = "apple";
		String str2 = "banana";
		
		int addition = num1 + num2;
		int subtraction = num1 - num2;
		int multiplication = num1 * num2;
		double division = (double)num1 / (double)num2;
		
		System.out.println(num1);
		System.out.println(num2);
		
		//num1 = 100;
		//System.out.println(num1);
		
		System.out.println(num1 + " + " + num2 + " = " + addition);
		System.out.println(num1 + " - " + num2 + " = " + subtraction);
		System.out.println(num1 + " * " + num2 + " = " + multiplication);
		System.out.println(num1 + " / " + num2 + " = " + division);
		
		System.out.println(character1);
		System.out.println(str1);
		System.out.println(str1 + ", " + str2);
		
	}

}
