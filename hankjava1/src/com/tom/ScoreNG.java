package com.tom;

import java.util.Scanner;

public class ScoreNG {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("�п�J�^�妨�Z�H");
		int english = Integer.parseInt(scanner.nextLine());
		System.out.println("�п�J�ƾǦ��Z�H");
		int math = Integer.parseInt(scanner.nextLine());
		if(math<=100 & english<=100 ) {
		int average = (math + english)/2;
		System.out.println(average);
		}else {
			System.out.println("�ٷQ�}��ڡI�I");
		}
	
		}catch(NumberFormatException e ){
		//	e.printStackTrace();
			System.out.println("�O�ÿ�J�I");	
		}
		
		
		
	}

}
