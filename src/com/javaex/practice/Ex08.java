package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		/*
		 아래와 같이 구구단을 출력하세요
		 */
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				int result = i*j;
				System.out.print(j + "*" + i + "=" + result + "\t");
			}
			System.out.println();
		}
	}

}
