package com.tyss.PiramidPatterns;

import java.util.Scanner;

public class PyramidPalindromicNumberPattern {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = sc.nextInt();
		int a = 0;
		for (int i = 1; i <= n; i++) {
			a = 0;
			for (int j = 1; j <= 2 * n - 1; j++) {
				if (i + j >= n + 1 && j - i <= n - 1) {
					if (j <= n) {
						a++;
						System.out.print(a + " ");

					} else {
						a--;
						System.out.print(a + " ");

					}
				} else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
	}

}
/*
 * enter the value of n
5
        1         
      1 2 1       
    1 2 3 2 1     
  1 2 3 4 3 2 1   
1 2 3 4 5 4 3 2 1 

 */
