package com.javaex.practice;

import java.util.Scanner;

public class Ex19_1 {
	
	
	/*
	 * 다른 형식의 블로그에서 가져온 코드
	 */
	
	
	
	
    private int balance;

    public Ex19_1() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원이 예금되었습니다. 현재 잔고: " + balance + "원");
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다. 현재 잔고: " + balance + "원");
        } else {
            System.out.println("잔고가 부족합니다. 출금이 불가능합니다.");
        }
    }

    public void checkBalance() {
        System.out.println("잔고액> " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex19_1 bank = new Ex19_1();

        while (true) {
        	System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("예금액> ");
                    int depositAmount = scanner.nextInt();
                    bank.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("출금액> ");
                    int withdrawAmount = scanner.nextInt();
                    bank.withdraw(withdrawAmount);
                    break;
                case 3:
                    bank.checkBalance();
                    break;
                case 4:
                    System.out.println("프로그램을 종료");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("다시 입력해주세요.");
            }
        }
    }
}
