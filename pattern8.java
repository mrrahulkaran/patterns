package forLoop;

import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
//		int nst=n*2-1;
		int nsp=n-2;
		int row=1;
		while(row<=n){
			
			for(int col=1; col<=n; col++) {
				
				if(row==col || col==n-row+1) {
					
					System.out.print("*");
					
					
				}else {
					
					System.out.print(" ");
					
					
				}
				
				
				
				
			}
			
			
			System.out.println();
			
			
			
			
			
			row++;
		}
		
		
		
		
		
		
		

	}

}
