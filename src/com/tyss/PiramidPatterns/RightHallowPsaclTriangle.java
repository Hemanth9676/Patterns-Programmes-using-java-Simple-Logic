package com.tyss.PiramidPatterns;

import java.util.Scanner;

public class RightHallowPsaclTriangle {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		
  // Logic 1
		
		for (int i = (-n) + 1; i < n; i++) {
			int a = i;
			if (a < 0)
				a = -a;

			for (int j = n - 1; j >= 0; j--) {
				if (a == j || j == n-1 )
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();

		}
		
		

	}

}
/* Second Logic using Co-Ordinates
 * 
 * for(int i=1;i<=n*2-1;i++) {

			for(int j=1;j<=n;j++) {
				if( i==j || i+j==n*2 || j == 1 ) 
					System.out.print("*"+" ");
				else 
					System.out.print(" "+" ");
				
			}
			System.out.println();
		}
		
		
Enter a Number
5
*         
* *       
*   *     
*     *   
*       * 
*     *   
*   *     
* *       
*         
    
 * */

