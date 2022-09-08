package com.javalec.base;

public class Main {

	public static void main(String[] args) {

		int i = 10;
		int j = 20;
		
		if(i > j) {
			System.out.println("i는 j보다 " + (i - j) + "만큼 큽니다.");
		} else if(j > i) {
			System.out.println("j는 i보다 " + (j - i) + "만큼 큽니다.");
		} else {
			System.out.println("i와 j는 동일 합니다.");
		}

		System.out.println("계산이 완료 되었습니다.");

	}

}
