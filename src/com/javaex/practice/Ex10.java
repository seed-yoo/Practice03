package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		/*
		 정수 다섯개를 입력받아 가장 큰 수를 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		int[] intArray =  new int[5];
		System.out.println("숫자를 입력하세요.");
		int max = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("숫자: ");
			intArray[i]=sc.nextInt();
			
			if(intArray[i] > max) {
				max = intArray[i];
				//System.out.println(max);
			}
			
		}
		System.out.println("최댓값: " + max);
		
		
		
		
		
		sc.close();
	}

}
