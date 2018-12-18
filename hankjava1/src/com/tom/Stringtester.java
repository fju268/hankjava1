package com.tom;

public class Stringtester {

	public static void main(String[] args) {
		String s = "Hello World";
		// System.out.println(s.indexOf('o' ,3));
		System.out.println(s.length());
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		String s2 = new String("Jack Tom Eric");
		String name = "boss";
		System.out.println();
		int index = s2.indexOf("Tom");
		
		System.out.print(s2.substring(0, 5) + name + s2.substring(8, 13));

	}

}
