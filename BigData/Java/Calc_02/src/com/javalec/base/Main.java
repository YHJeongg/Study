package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;

		// 사용자의 입력값이 짝수인지 홀수인지 알려주기
		System.out.print("숫자를 입력해 주세요 : ");
		num = sc.nextInt();
		String result = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println("당신이 입력한 숫자는 " + result + " 입니다.");

	}

}
