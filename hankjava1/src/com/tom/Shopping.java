package com.tom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		List<Item> items = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String name = "";
		while(!name.equals("q")) {
		System.out.print("Pleace enter item name: ");
		 name = scanner.nextLine();
		 if(name.equals("q")) {
			 break;
		 }
		 
		System.out.print("Pleace enter quantity: ");
		int qty =Integer.parseInt(scanner.nextLine());

		items.add(new Item(name,qty));
		for(Item item : items) {
			System.out.println(item.name + "\t" + item.qty);
		}
		}

	}

}
