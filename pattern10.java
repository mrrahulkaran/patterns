package forLoop;

import java.util.Scanner;

public class pattern10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp=0;
		int nst=2*n;
		
		int row=1;
		while(row<=n) {
			
			
			
			
           for(int csp=1; csp<=nsp; csp++) {
				
				
				System.out.print(" ");
				
			}
			
			for(int cst=1; cst<=nst-1; cst++){
				
				System.out.print("*");
			}
			
			
			
			System.out.println();
			
			nst=nst-2;
			nsp++;
			
			
			
			
			
			
			
			
			
			
			row++;
		}
		
				
		
		

	}

}
