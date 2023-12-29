package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		/*
		 13번 문제에 아래와 같이 계산식이 표시되도록 프로그램을 작성하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
			if(i == n) {
				System.out.println(n);
			}else {
				System.out.print(i + "+");
			}
		}
		System.out.println("합계" + sum);
		
		
		sc.close();
	}

}
