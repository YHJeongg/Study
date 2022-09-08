package com.javalec.base;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		double inputWeightKg, inputStatureCm, statureMeter, bmi;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게(kg)를 입력하세요 : ");
		inputWeightKg = sc.nextInt();
		System.out.print("키(cm)를 입력하세요 : ");
		inputStatureCm = sc.nextInt();
		
		statureMeter = inputStatureCm / 100;
		bmi = inputWeightKg / (statureMeter * statureMeter);

		System.out.printf("당신의 BMI는 " + "'" + bmi + "'" + "이고 ");
		
		if (bmi > 30) {
			System.out.println("고도비만 입니다.");
		} else if (bmi > 25) {
			System.out.println("비만 입니다.");
		} else if (bmi > 23) {
			System.out.println("과체중 입니다.");
		} else if (bmi > 18.5) {
			System.out.println("정상체중 입니다.");
		} else {
			System.out.println("저체중 입니다.");
		}
	}	
}