package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int inputScore = 0;
		String grade = "";
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요 : ");
        inputScore = sc.nextInt();

        if(inputScore >= 90) {
            grade = "A";
        }
        else if(inputScore >= 80) {
            grade = "B";
        }
        else if(inputScore >= 70) {
            grade = "C";
        }
        else if(inputScore >= 60) {
            grade = "D";
        }
        else {
            grade = "F";
        }

        System.out.println("귀하는 " + grade + "학점 입니다.");

	}

}