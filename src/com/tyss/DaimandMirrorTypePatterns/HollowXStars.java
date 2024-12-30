package com.tyss.DaimandMirrorTypePatterns;

import java.util.Scanner;

public class HollowXStars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = sc.nextInt();

		for (int i = 1; i <= 2 * n - 1; i++) {
			int a = 0;
			for (int j = 1; j <= 2 * n - 1; j++) {

				if (i == j || i+j == n*2) {
					
						System.out.print(" " + " ");
				} else
					System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
/*
 * Example :-
 * enter the value of n
5
  * * * * * * *   
*   * * * * *   * 
* *   * * *   * * 
* * *   *   * * * 
* * * *   * * * * 
* * *   *   * * * 
* *   * * *   * * 
*   * * * * *   * 
  * * * * * * *   

 */

