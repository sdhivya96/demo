package com.automations.day14;

import java.util.Scanner;

public class PrintAltrArray {

	public static void main(String[] args) {
		// String s[][] = new String[4][3];
		// Scanner in = new Scanner(System.in);
		// for (int i = 0; i <= s.length - 1; i++) {
		// for (int j = 0; j <= s[i].length - 1; j++) {
		// s[i][j] = in.next();
		// }
		// }
		String s[][] = { { "0", "1", "2" }, { "3", "4", "5" }, { "6", "7", "8" }, { "9", "10", "11" },
				{ "12", "13", "14" } };
		int row, col;
		for (row = 0; row <= s.length - 1; row++) {

			for (col = 0; col <= s[row].length - 1; col++) {
				System.out.print(s[row][col] + " ");
				col = col + 1;
			}
			row = row + 1;
			System.out.println();

		}

	}

}
