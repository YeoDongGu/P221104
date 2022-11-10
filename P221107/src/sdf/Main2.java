package sdf;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		int n = sc.nextInt();
		sc.close();

		int c = a.length();

		if (c >= n) {
			for (int i = (c - 1); i >= (c - n); i--) {
				System.out.printf("%s", a.charAt(i));

			}
		} else if (c < n) {
			for (int i = c - 1; i >= 0; i--) {
				System.out.printf("%s", a.charAt(i));
			}
		}

	}
}