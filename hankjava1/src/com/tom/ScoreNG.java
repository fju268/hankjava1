package com.tom;

import java.util.Scanner;

public class ScoreNG {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("請輸入英文成績？");
		int english = Integer.parseInt(scanner.nextLine());
		System.out.println("請輸入數學成績？");
		int math = Integer.parseInt(scanner.nextLine());
		if(math<=100 & english<=100 ) {
		int average = (math + english)/2;
		System.out.println(average);
		}else {
			System.out.println("還想破表啊！！");
		}
	
		}catch(NumberFormatException e ){
		//	e.printStackTrace();
			System.out.println("別亂輸入！");	
		}
		
		
		
	}

}
