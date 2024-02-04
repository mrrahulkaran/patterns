package forLoop;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		
		int row=0;
		while(row<n) {
			
			int col=0;
			while(col<=row) {
				
				System.out.print("*");
				col++;
				
			}
			System.out.println();
			
			row++;
		} 
		

	}

}
