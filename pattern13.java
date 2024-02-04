package forLoop;

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int str=1;
		int nr=(2*n-1);
		int row=1;
		while(row<=nr){
			
			int st =1;
			while(st<=str) {
				
				System.out.print("*");
				
				st++;
				
			}
			System.out.println();
			
			if(row <= nr/2) {
				
				str++;
				
			}else {
				
				str--;
				
			}


			row++;
		}
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
