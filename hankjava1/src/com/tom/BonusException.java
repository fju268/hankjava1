package com.tom;

import java.util.Random;
import java.util.Scanner;

public class BonusException {

	public static void main(String[] args) {
		boolean validate = false;
		while(!validate) {
		Random random = new Random();
		int bonus = random.nextInt(999999999);
		Scanner scanner = new Scanner(System.in);
		System.out.println("�h�֤H���H");
		String number = scanner.nextLine();
		if(number.length()>0 && number.length()<=3) {
				
		int n = Integer.parseInt(number);
		int div = bonus/n;
		System.out.println("�C�H�o�G"+div);
		}
		}
	}

}
