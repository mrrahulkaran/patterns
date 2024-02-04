package forLoop;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int str = n;
		int spc = 0;

		int row = 1;
		while (row <= n) {

			int sp = 1;
			while (sp <= spc) {

				System.out.print(" ");
				sp++;
			}

			int st = 1;
			while (st <= str) {

				System.out.print("*");

				st++;
			}

			System.out.println();
			str--;
			spc++;
			row++;
		}

	}

}
