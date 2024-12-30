package com.tyss.PiramidPatterns;

import java.util.Scanner;

public class HollowReverseInvertedPyramidStarPattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scn.nextInt();

		// Logic 1 using 2 lopps
		for (int i = n - 1; i >= 0; i--) {
			for (int j = (-n) + 1; j < n; j++) {
				int a = j;
				if (a < 0)
					a = -a;
				if (i <= a)
					 // ---> "If you want Reverse Hollow Pyramid Pattern,' just replace i >= a with (i == a || i == n-1). The remaining code stays the same; do not change anything else."
					System.out.print("*" + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
		
		
	}
}
/* Second Logic using Co-Ordinates
 * 
 * for (int i = 1; i <= n; i++) {
			for (int j = 1; j < n * 2; j++) {
			
				if (i >= j || i + j >= n * 2) {
				---> "If you want Reverse Hollow Pyramid Pattern,' just replace if (i >= j || i + j >= n * 2)  with if (i == j || i + j == n * 2 || i == 1). The remaining code stays the same; do not change anything else."
					
					System.out.print("*"+" ");
				} else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		
Enter a Number
5
*               * 
* *           * * 
* * *       * * * 
* * * *   * * * * 
* * * * * * * * * 


 * */

