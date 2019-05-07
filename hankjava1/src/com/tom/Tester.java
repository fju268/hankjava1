package com.tom;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tester {
	
	public static void main(String [] args) {
		
	int n = Integer.parseInt("36");
/*	try {
	FileReader fr = new FileReader("aa.txt");
	}catch(FileNotFoundException e ) {
		e.printStackTrace();
	}
*/
/*		File file = new File("aa.txt");
 		System.out.println(file.exists());
 		System.out.println(file.canRead());
 		System.out.println(file.length());
		if(file.exists()) {
			System.out.println(file.getTotalSpace);
			System.out.println(file.getName() + "/t" + file.getAbsolutePath());
		}
*/		
		File dir = new File("c:\\upfile");
		if(dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles();
			for(File f: files) {
				if(f.isFile()) {
					System.out.println(f.getName());
				}
			}
			File dd = new File(dir,"fuck");
			System.out.println(dd.mkdir());
				
			
		}
	}
}
