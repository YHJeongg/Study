package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int inputAmount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		inputAmount = sc.nextInt();
		
		if(inputAmount > 8000) {
			System.out.println("너무 비쌉니다.");
		} else if(inputAmount <= 8000 && inputAmount > 5000) {
			System.out.println("조금 비쌉니다.");
		} else if(inputAmount <= 5000 && inputAmount > 3000) {
			System.out.println("적당한 금액 입니다.");
		} else {
			System.out.println("싼 편입니다.");
		}

	}

}
