package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {

		/*
		 다음과 같이 출력하세요
		 */
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 10; j++) {
				int result = i+j;
				System.out.print(result +"\t");
			}
			System.out.println();
		}
	}

}
