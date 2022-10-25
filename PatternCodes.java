package com.ineuron.basics;

public class PatternCodes {

	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("  ");
		int m = 14;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if (i == 0 || j == 0 || i == (m - 1) || j == (m - 1)
						|| i < (m - 1) / 2 && j < (m - 1) / 2 && i + j <= (m - 1) / 2
						|| i < (m - 1) / 2 && j > (m - 1) / 2 && j - i - 1 >= (m - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("  ");

		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if (i >= (m - 2) || j == 0 && i >= (m - 1) / 2 || j == (m - 1) && i >= (m - 1) / 2
						|| i > (m - 1) / 2 && j < (m - 1) / 2 && i - j >= (m - 1) / 2
						|| i > (m - 1) / 2 && j > (m - 1) / 2 && i + j >= m + 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println("  ");
		}
		System.out.println("  ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if (i == 0 || j == 0 || i == (m - 1) || i < (m - 1) / 2 && j < (m - 1) / 2 && i + j <= (m - 1) / 2
						|| i > (m - 1) / 2 && j <= (m - 1) / 2 && i - j >= (m - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println("  ");
		}
	}
}
