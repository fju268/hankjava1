package com.tom;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("�п�J�^�妨�Z�H");
			Grade english = new Grade(scanner.nextLine());
			System.out.println("�п�J�ƾǦ��Z�H");
			Grade math = new Grade(scanner.nextLine());
			int average = ((math.grade +english.grade)/2);
			System.out.println(average);
		}catch(GradeFormatException e) {
			System.out.print(e.getMessage());
		}
	}

}
