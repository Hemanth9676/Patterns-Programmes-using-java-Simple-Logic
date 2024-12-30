package com.tyss.DaimandMirrorTypePatterns;

import java.util.Scanner;

public class CrossDiamondPatterns {
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

					if (a != b)   
						System.out.print("*" + " ");
					else
						System.out.print(" " + " ");

				}
				System.out.println();

			}
			

		}
	}
		/*
		* second logic  using 2 loops
			
			for (int i = 1; i <= 2 * num - 1; i++) {
				for (int j = 1; j <= 2 * num - 1; j++) {
					if (i + j == num + 1 || i - j == num - 1 || j - i == num - 1 || i + j == 3 * num - 1) {
						System.out.print(" "+" ");
					}

					else {
						System.out.print("*"+" ");
					}
				}
				System.out.println();
		}
	Example:-
	* * * *   * * * * 
	* * *   *   * * * 
	* *   * * *   * * 
	*   * * * * *   * 
	  * * * * * * *   
	*   * * * * *   * 
	* *   * * *   * * 
	* * *   *   * * * 
	* * * *   * * * * 

		*/

