package com.currencyDenominations.services;

import java.util.Scanner;

public class MyConsole {
	
	static Scanner scan=new Scanner(System.in);
	
	//Print message
	public static void print(String message) {
		System.out.println(message);
	}
	
	//Print message and take integer user input
	public static int getIntegerValues(String message) {
		System.out.print(message);
		return scan.nextInt();
	}

}
