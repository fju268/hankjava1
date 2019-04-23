package com.tom;

import java.util.Random;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Random random = new Random();
		int bonus = random.nextInt(99999999);
		Scanner scanner = new Scanner(System.in);
		System.out.println("多少人分？");
		String number = scanner.nextLine();
		try {
			int n = Integer.parseInt(number);
			if(n>=0) {
			int div = bonus / n;
			System.out.println("每人得多少：" + div);
			}else {
				System.out.println("你是智障嗎？");
			}
		} catch (ArithmeticException e ) {
			System.out.println("幹會數學嗎？");
		}catch (NumberFormatException e ) {
			System.out.println("文盲？");
		}
	}
	
}
