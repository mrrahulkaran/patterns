package forLoop;

import java.util.Scanner;

public class pattern11 {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp=n-1;
		int nst=1;
		int row =1;
		while(row<=n) {
			
			
			for(int csp=1; csp<=nsp; csp++) {
				
				System.out.print(" ");
			}
			for(int cst=1; cst<=nst; cst++) {
				
				 if(cst%2 != 0){
	                    System.out.print("*");
				
			}else {
			
				System.out.print(" ");
			
			}
				 
				 
				 
			}
			
			
			System.out.println();
			
			 nsp--;
	            nst+=2;
			
			
			
			row++;
		}
	
		
		
	}

}
