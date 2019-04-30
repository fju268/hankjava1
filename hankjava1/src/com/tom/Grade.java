package com.tom;

public class Grade {
	int grade;
	public  Grade(String grade) throws GradeFormatException {
		try {
		this.grade = Integer.parseInt(grade);
		}catch(NumberFormatException e) {
			throw new GradeFormatException();
		}
		
		
		
	}
		
}
