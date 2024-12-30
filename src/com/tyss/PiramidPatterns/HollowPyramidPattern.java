package com.tyss.PiramidPatterns;

import java.util.Scanner;

public class HollowPyramidPattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		
		//Logic 1 
		for (int i = 0; i < n; i++) {
			for (int j = (-n) + 1; j < n; j++) {

				int a = j;
				if (a < 0)
					a = -a;

				if (i == a || i == n-1)
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();

		}
		
		 
	}

}

/*
 *  Second Logic using Co-Ordinates 
 *  
	     for(int i = 1 ; i <= n ; i++)
	      {
	    	  for(int j = 1 ; j <= n*2-1 ; j++)
	    	  {
	    		  if(i+j == n+1 || j-i==n-1 || i == n)
	    		  {
	    			  System.out.print("*"+" ");
	    		  }
	    		  else
	    		  {
	    			  System.out.print(" "+" ");
	    		  }
	    	  }
	    	  System.out.println();
	      }

 * 
 Enter the value of n
5
        *         
      *   *       
    *       *     
  *           *   
* * * * * * * * * 



 */


