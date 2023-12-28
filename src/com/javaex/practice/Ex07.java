package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		/*
		 숫자를 입력받아 아래와 같이 출력하세요
		 출력값:
		 숫자를 입력하세요.
		 7
		 1
		 22
		 333
		 4444
		 55555
		 666666
		 7777777
		 ======================
		 숫자를 입력하세요.
		 7
		 1
		 22
		 333
		 4444
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
		
		sc.close();
		
		
		
	}

}
