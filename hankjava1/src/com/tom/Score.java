package com.tom;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("請輸入英文成績？");
			Grade english = new Grade(scanner.nextLine());
			System.out.println("請輸入數學成績？");
			Grade math = new Grade(scanner.nextLine());
			int average = ((math.grade +english.grade)/2);
			System.out.println(average);
		}catch(GradeFormatException e) {
			System.out.print(e.getMessage());
		}
	}

}
