package com.ineuron.basics;

public class Namepattern {

	public static void main(String[] args) {
		int n = 11;
		int m = 7;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == (n - 1) / 2) {
					System.out.print("t");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (i == 0 && j > 0 || i == (m - 1) / 2 || i == m - 1 && j > 0 || j == 0 && i > 0 && i < (m - 1)) {
					System.out.print("e");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == (n - 1) / 2 && i - 1 <= 3 * (m - 1) / 4
						|| i == m - 1 && j < (n - 1) / 2 && j % 2 != 0) {
					System.out.print("j");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("");
			for (int j = 0; j < n; j++) {
				if (i + j == (n - 1) / 2 || j - i == (n - 1) / 2 || j == 0 && i == m - 1 || j == n - 1 && i == m - 1
						|| i == (m - 1) / 2 && j > (n - 1) / 4 && j <= 3 * (n - 1) / 4) {
					System.out.print("a");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (i == 0 && j > 0 && j <= (n - 1) || j == 0 && i > 0 && i < (m - 1) / 2
						|| i == (m - 1) / 2 && j > 0 && j < (n - 1) || j == (n - 1) && i > (m - 1) / 2 && i < (m - 1)
						|| i == m - 1 && j < (n - 1)) {
					System.out.print("s");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == (n - 1) || i == (m - 1) / 2) {
					System.out.print("h");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 0 && j < n - 1 || j == n - 1 && i < (m - 1) / 2 && i != 0
						|| i == (m - 1) / 2 && j < n - 1
						|| i > (m - 1) / 2 && j > (n - 1) / 2 && j - i == (m - 1) / 2) {
					System.out.print("r");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (i == 0 && j > 0 || i == (m - 1) / 2 || i == m - 1 && j > 0 || j == 0 && i > 0 && i < (m - 1)) {
					System.out.print("e");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (i == 0 && j > 0 || i == (m - 1) / 2 || i == m - 1 && j > 0 || j == 0 && i > 0 && i < (m - 1)) {
					System.out.print("e");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("          ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 0 && j <= n - 2 || j == n - 1 && i < (m - 1) / 2 && i != 0
						|| i == (m - 1) / 2 && j < n - 1) {
					System.out.print("p");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("");
			for (int j = 0; j < n; j++) {
				if (i + j == (n - 1) / 2 || j - i == (n - 1) / 2 || j == 0 && i == m - 1 || j == n - 1 && i == m - 1
						|| i == (m - 1) / 2 && j > (n - 1) / 4 && j <= 3 * (n - 1) / 4) {
					System.out.print("a");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 0 && j < (n - 2) || i == 1 && j == (n - 2)
						|| j == n - 1 && i > 1 && i < m - 2 && i != 0 || i == m - 2 && j == n - 2
						|| i == m - 1 && j < n - 2) {
					System.out.print("d");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || i <= (m - 1) / 2 && j <= (n - 1) / 2 && i == j
						|| i - 1 <= (m - 1) / 2 && j >= (n - 1) / 2 && i + j == (n - 2) || j == n - 2) {
					System.out.print("m");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (i + j == (n - 1) / 2 || j - i == (n - 1) / 2 || j == 0 && i == m - 1 || j == n - 1 && i == m - 1
						|| i == (m - 1) / 2 && j > (n - 1) / 4 && j <= 3 * (n - 1) / 4) {
					System.out.print("a");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("");
			for (int j = 0; j < n; j++) {
				if (j < (n - 1) / 2 && i == j || j >= (n - 1) / 2 && i + j == n - 1) {
					System.out.print("v");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("");
			for (int j = 0; j < n; j++) {
				if (i + j == (n - 1) / 2 || j - i == (n - 1) / 2 || j == 0 && i == m - 1 || j == n - 1 && i == m - 1
						|| i == (m - 1) / 2 && j > (n - 1) / 4 && j <= 3 * (n - 1) / 4) {
					System.out.print("a");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == (n - 1) / 2) {
					System.out.print("t");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == (n - 1) || i == (m - 1) / 2) {
					System.out.print("h");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (j == (n - 1) / 2) {
					System.out.print("i");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

		System.out.println(" ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (j == (n - 1) / 2) {
					System.out.print("i");
				} else {
					System.out.print(" ");
				}

			}
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j - 1 || j == (n - 3)) {
					System.out.print("n");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (i == 0 && j > 0 || i == (m - 1) / 2 || i == m - 1 && j > 0 || j == 0 && i > 0 && i < (m - 1)) {
					System.out.print("e");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (j == 0 && i < m - 2 || j == n - 1 && i < m - 2 || i == m - 2 && j == 1
						|| i == m - 1 && j > 1 && j < n - 2 || i == m - 2 && j == n - 2) {
					System.out.print("u");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 0 && j < n - 1 || j == n - 1 && i < (m - 1) / 2 && i != 0
						|| i == (m - 1) / 2 && j < n - 1
						|| i > (m - 1) / 2 && j > (n - 1) / 2 && j - i == (m - 1) / 2) {
					System.out.print("r");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (i >= (m - 1) / 4 && i - j + 1 == (m - 1) / 2
						|| j > (n - 1) / 2 && i > (m - 1) / 4 && i + j == (n - 1) + 1
						|| i <= (m - 1) / 4 && j < (n - 1) / 4 && i != 0 && j != 0
						|| i <= (m - 1) / 4 && j > (n - 1) / 4 && i + j == n - 2 && i != 0 || i == 1 && j != 0
								&& j != n - 1 && j != (n - 1) / 2 && j + 1 != (n - 1) / 2 && j - 1 != (n - 1) / 2
						|| i - 1 == (m - 1) / 4 && j == (n - 1) / 2) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j - 1 || j == (n - 3)) {
					System.out.print("n");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}

}
