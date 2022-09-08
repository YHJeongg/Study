package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// // 조건문
		// int i = 10;
		// int j = 20;
		// int k = 30;

		// if(i > j) {
		// 	System.out.println("i가 j보다 큽니다.");
		// } else if(i == j) {
		// 	System.out.println("i가 j와 같습니다.");
		// } else {
		// 	System.out.println("i가 j보다 작습니다.");
		// }

		// System.out.println(">>> End <<<");

		int num1, num2;
		String result = "";
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			result = "보다 큽니다.";
		} else if(num1 < num2) {
			result = "보다 작습니다.";
		} else {
			result = "와 동일합니다.";
		}

		System.out.println("\n첫번째 숫자가 두번째 숫자" + result + "\nThank You.");

	}

}
