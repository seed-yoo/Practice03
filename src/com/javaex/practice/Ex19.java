package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {

		/*
		 아래와 같이 은행 프로그램을 작성하세요
			“1.예금” 선택후 금액을 입력하면 예금액이 합산됩니다.
			“2.출급” 선택후 금액을 입력하면 예금액이 차감됩니다.
			“3.잔고” 선택시 현재 잔고가 출력됩니다.
			“4.종료” 선택시 종료됩니다.
			“1,2,3,4 이외의 숫자” 다시입력해주세요 메시지 출력됩니다.
		 */
		Scanner sc = new Scanner(System.in);

		int a=0;
		int b=0;
		int c=0;
		
		do {
			
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");
			int n = sc.nextInt();
			
			if(n>=1 && n<=3) {
				
				switch (n) {
				case 1:
					System.out.println("예금액>");
					int amount = sc.nextInt();
					a = a + amount;
					break;
				case 2:
					System.out.println("출금액>");
					int ba = sc.nextInt();
					b = b + ba;
					break;
				case 3:
					c =+ a-b;
					System.out.println("잔고>");
					System.out.println(c);
					break;
				}
				
			}else if(n==4) break;
			else {
				System.out.println("다시입력해주세요");
				
			}
			
		} while (true);

		System.out.println("프로그램 종료");
		sc.close();
		
		
		
		
	}

}
