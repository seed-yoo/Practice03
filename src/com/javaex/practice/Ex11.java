package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		/*
		 다음과 같은 프로그램을 작성하세요
			a. 입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 을 출력니다.
			- 예) 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 ) 
			b. 입력 받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 을 출력니다.
			 - 예) 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 )
			 
		 결과 출력값:
		  - 7입력시
		  숫자를 입력하세요
		  7
		  결과값: 16
		  --------------
		  - 10입력시
		  숫자를 입력하세요
		  10
		  결과값: 30
		  --------------
		  - 11입력시
		  숫자를 입력하세요
		  11
		  결과값: 36
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
		int sum = 0;
		if(n%2 ==1) {
			for (int i = 1; i <= n; i+=2) {
				sum = sum +i;
			}
			System.out.print("결과값: " + sum);
		}else if(n%2 == 0) {
			for (int i = 2; i <= n; i+=2) {
				sum = sum +i;
			}
			System.out.print("결과값: " + sum);
		}
		
		
		sc.close();
		
		
		
	}

}
