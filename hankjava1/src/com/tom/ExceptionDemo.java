package com.tom;

import java.util.Random;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Random random = new Random();
		int bonus = random.nextInt(99999999);
		Scanner scanner = new Scanner(System.in);
		System.out.println("�h�֤H���H");
		String number = scanner.nextLine();
		try {
			int n = Integer.parseInt(number);
			if(n>=0) {
			int div = bonus / n;
			System.out.println("�C�H�o�h�֡G" + div);
			}else {
				System.out.println("�A�O���ٶܡH");
			}
		} catch (ArithmeticException e ) {
			System.out.println("�F�|�ƾǶܡH");
		}catch (NumberFormatException e ) {
			System.out.println("�媼�H");
		}
	}
	
}
