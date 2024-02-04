package forLoop;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int spc=n-1;
		int str = 1;
        int row =1;
		
        while(row<=n) {
        	
        int col=1;
        while(col<=n){
        	
        	if(col<=spc) {
        		
        		System.out.print(" ");
        		
        	}else {
        		
        		System.out.print("*");	
        	}
        col++;
        
        }

        System.out.println();
        
            spc--;	
        	row++;
        }}}
        
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	


