package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		/*
		 팩토리얼은 다음과 같이 정의된다. 숫자를 1개 입력받아 팩토리얼 값을 출력하세요.
			5 입력시 1*2*3*4*5 의 값이 출력됩니다.
			7 입력시 1*2*3*4*5*6*7 의 값이 출력됩니다.
			팩토리얼공식 𝐧! = 𝟏 × 𝟐 × 𝟑 × ⋯ × n
			
		결과 출력값:
		
		숫자를입력하세요.
		4
		결과값: 24
		----------------------
		숫자를입력하세요.
		5
		결과값: 120
		----------------------
		숫자를입력하세요.
		10
		결과값: 3628800
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를입력하세요");
		int n = sc.nextInt();
		
		int x=1;
		
		for (int i = 1; i <= n; i++) {
			x = x*i;
		}
		
		System.out.println("결과값: " + x );
		
		sc.close();
		
		
	}

}
