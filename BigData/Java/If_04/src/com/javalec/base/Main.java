package com.javalec.base;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String[] subjectArray = { "국어", "영어", "수학" };
		double totalScore = 0.0;
		double avgScore = 0.0;
		int[] inputScoreArray = new int[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < inputScoreArray.length; i++) {
			do {
				System.out.print(subjectArray[i] + " 점수를 입력하세요 : ");
				inputScoreArray[i] = sc.nextInt();
				if (inputScoreArray[i] < 0 || inputScoreArray[i] > 100) {
					System.out.println("다시 입력 하세요.");
				}
			} while (inputScoreArray[i] < 0 || inputScoreArray[i] > 100);
			totalScore += inputScoreArray[i];
		}
		avgScore = totalScore / inputScoreArray.length;
		System.out.println("평균: " + avgScore);

		for (int i = 0; i < subjectArray.length; i++) {
			if (inputScoreArray[i] > avgScore) {
				System.out.println(subjectArray[i] + " 점수는 평균 보다 높습니다.");
			} else if (inputScoreArray[i] < avgScore) {
				System.out.println(subjectArray[i] + " 점수는 평균 보다 낮습니다.");
			} else {
				System.out.println(subjectArray[i] + " 점수는 평균 입니다.");
			}
		}	

		// int inputScoreKorean, inputScoreEnglish, inputScoreMath;
		// double totalScore, avgScore;
		// Scanner sc = new Scanner(System.in);

		// do {
		// System.out.print("국어 점수를 입력하세요 : ");
		// inputScoreKorean = sc.nextInt();
		// if (inputScoreKorean < 0 || inputScoreKorean > 100) {
		// System.out.println("다시 입력 하세요.");
		// }
		// } while (inputScoreKorean < 0 || inputScoreKorean > 100);

		// do {
		// System.out.print("영어 점수를 입력하세요 : ");
		// inputScoreEnglish = sc.nextInt();
		// if (inputScoreEnglish < 0 || inputScoreEnglish > 100) {
		// System.out.println("다시 입력 하세요.");
		// }
		// } while (inputScoreEnglish < 0 || inputScoreEnglish > 100);

		// do {
		// System.out.print("수학 점수를 입력하세요 : ");
		// inputScoreMath = sc.nextInt();
		// if (inputScoreMath < 0 || inputScoreMath > 100) {
		// System.out.println("다시 입력 하세요.");
		// }
		// } while (inputScoreMath < 0 || inputScoreMath > 100);

		// totalScore = inputScoreKorean + inputScoreEnglish + inputScoreMath;
		// avgScore = totalScore / 3;

		// System.out.println("평균점수 : " + avgScore);

		// if (avgScore < inputScoreKorean) {
		// System.out.println("국어 점수는 평균 보다 높습니다.");
		// } else if (avgScore > inputScoreKorean) {
		// System.out.println("국어 점수는 평균 보다 낮습니다.");
		// } else {
		// System.out.println("국어 점수는 평균 점수 입니다.");
		// }

		// if (avgScore < inputScoreEnglish) {
		// System.out.println("영어 점수는 평균 보다 높습니다.");
		// } else if (avgScore > inputScoreEnglish) {
		// System.out.println("영어 점수는 평균 보다 낮습니다.");
		// } else {
		// System.out.println("영어 점수는 평균 점수 입니다.");
		// }

		// if (avgScore < inputScoreMath) {
		// System.out.println("수학 점수는 평균 보다 높습니다.");
		// } else if (avgScore > inputScoreMath) {
		// System.out.println("수학 점수는 평균 보다 낮습니다.");
		// } else {
		// System.out.println("수학 점수는 평균 점수 입니다.");
		// }

	}

}
