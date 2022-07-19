package com.automations.day14;

import java.util.Scanner;

public class ReverseString {
	public static void reverse(String r) {
		for (int i = r.length() - 1; i >= 0; i--) {
			System.out.print(r.charAt(i));
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the string  : ");
		Scanner in = new Scanner(System.in);
		String s = in.next();
		reverse(s);

	}

}
