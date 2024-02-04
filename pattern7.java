package forLoop;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nst =n;
		int nsp=0;
		
		int row=1;
		while(row<=n) {
			
			
			if(row==1 || row==n) {
				
				for(int cst=1; cst<=nst; cst++) {
					
					System.out.print("*");
					
				}
				
			}else {
				
	     for(int cst=1; cst<=1; cst++) {
					
					System.out.print("*");
					
	     }
	     

			for(int csp=1; csp<=nst-2; csp++) {
				
				System.out.print(" ");	
				
			}
			  for(int cst=1; cst<=1; cst++) {
					
					System.out.print("*");
					
				}
	  
				
			}
			
			
			   System.out.println();
			     
			     row++;
			     
			
			
			
		
			
			
			

     
				
				
			}
			
			
			
			
			
			
			
			
		}
		
		
		
	}


