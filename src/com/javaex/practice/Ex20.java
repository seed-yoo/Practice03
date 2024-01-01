package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		System.out.println("		[숫자맞추기 게임]");
		System.out.println("================================");
		int num = (int)(Math.random()*100)+1;
		System.out.println(num);
		
		do {
			System.out.println(">>");
			int n = sc.nextInt();
			sc.nextLine();
			
			if(num == n) {
				System.out.println("맞았습니다");
				break;
			}else if( num > n) {
				System.out.println("더 높게");
				continue;
			}else if ( num < n ) {
				System.out.println("더 낮게");
				continue;
			}
			
		} while (true);
		
		System.out.println("게임을 종료하시겠습니까?(y/n) >>");
		String an = sc.nextLine();
		
		if(an.equals("y")) {
			System.out.println("================================");
			System.out.println("		[숫자맞추기 종료]");
			System.out.println("================================");
		}
		
		sc.close();
	}

}
