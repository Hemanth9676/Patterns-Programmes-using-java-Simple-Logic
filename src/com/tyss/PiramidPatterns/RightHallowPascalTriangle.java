package com.tyss.PiramidPatterns;

import java.util.Scanner;

public class RightHallowPascalTriangle {
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
				if (a >= j )
					  //---> "If you want  Hollow Right Pascal Triangle,' just replace a >= j with a == j || j == n-1. The remaining code stays the same; do not change anything else."
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
				if( i<=j || i+j>=n*2 ) 
					System.out.print("*"+" ");
       ---> "If you want  Hollow Right Pascal Triangle,' just replace if( i<=j || i+j>=n*2 )  with if( i==j || i+j==n*2 || j == 1 ) . The remaining code stays the same; do not change anything else."
				else 
					System.out.print(" "+" ");
				
			}
			System.out.println();
		}
		
Enter a Number
5
* * * * * 
  * * * * 
    * * * 
      * * 
        * 
      * * 
    * * * 
  * * * * 
* * * * * 
    


 * */

