package com.tyss.DaimandMirrorTypePatterns;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = scn.nextInt();

		// Logic 1 using 2 loops

		for (int i = (-num) + 1; i < num; i++) {
			int a = i;
			if (a < 0)
				a = -a;
			a = a - (num - 1);
			if (a < 0)
				a = -a;
			for (int j = (-num) + 1; j < num; j++) {
				int b = j;
				if (b < 0)
					b = -b;

				if (a >= b) 
					/* ---> "If you want Hollow Diamond in a Square,' just replace a >= b with a <= b. The remaining code stays the same; do not change anything else."
					  ---> "If you want Hollow Diamond Pattern,' just replace a >= b with a == b. The remaining code stays the same; do not change anything else."
					---> "If you want "Cross-Diamond Pattern",' just replace a >= b with a != b. The remaining code stays the same; do not change anything else."
					*/ 
					System.out.print("*" + " ");

				else

					System.out.print(" " + " ");

			}
			System.out.println();

		}

	}

}
/*
 * second logic by using Co-Oridinates and using 2 loops 
		
		for (int i = 1; i <= 2 * num - 1; i++) {
			for (int j = 1; j <= 2 * num - 1; j++) {
				if (i + j >= num + 1 && i - j <= num - 1 && j - i <= num - 1 && i + j <= 3 * num - 1) {
					System.out.print("*"+" ");
				}

				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
example:-
Enter a Number
5
        *         
      * * *       
    * * * * *     
  * * * * * * *   
* * * * * * * * * 
  * * * * * * *   
    * * * * *     
      * * *       
        *         

*/
