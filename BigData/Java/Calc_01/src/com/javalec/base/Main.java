package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 연산자 종류별 출력
		int num1 = 10, num2 = 2, num3 = 5;
		
		System.out.println("<<<<< 산술 연산자 >>>>>");
		System.out.println("덧셈 : " + num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println("뺄셈 : " + num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println("곱셈 : " + num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println("나눗셈 : " + num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println("나눗셈 나머지 : " + num1 + " % " + num2 + " = " + (num1 % num2));
		
		// 자동 증강 연산자 
		num1 += 1;
		System.out.println(num1);

		// 자동 증감 연산자 
		num1 --;
		System.out.println(num1 + "\n");

		System.out.println("<<<<< 동등비교 관계 연산자 >>>>>");
		System.out.println("num1 == num2 : " + (num1 == num2));
		System.out.println("num1 != num2 : " + (num1 != num2));
		System.out.println("num1 > num2 : " + (num1 > num2));
		System.out.println("num1 < num2 : " + (num1 < num2));
		System.out.println("num1 >= num2 : " + (num1 >= num2));
		System.out.println("num1 <= num2 : " + (num1 <= num2) + "\n");

		System.out.println("<<<<< 논리 연산자 >>>>>");
		System.out.println(num1 + " > " + num2 + " && " + num2 + " > " + num3 + " : " + ((num1 > num2) && (num1 > num3)));
		System.out.println(num1 + " > " + num2 + " || " + num2 + " > " + num3 + " : " + ((num1 > num2) || (num1 > num3)) + "\n");

		System.out.println("<<<<< 삼항 연산자 >>>>>");
		String result = num3 == 5 ? "Yes" : "No";
		System.out.println("삼함 연산 결과 : " + result);

	}

}
