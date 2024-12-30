package com.tyss.PiramidPatterns;

import java.util.Scanner;

public class LeftPascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
// Logic 1
		for (int i = (-n) + 1; i < n; i++) {
			int a = i;

			if (a < 0)
				a = -a;

			a = a - (n - 1);

			if (a < 0)
				a = -a;

			for (int j = n - 1; j >= 0; j--) {
				if (a >= j)
					// ---> "If you want "Hollow Inverted Left Pascal Triangle",' just replace a >=j with a <= j. The remaining code stays the same; do not change anything else
					
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
 * for(int i=1;i<=n*2-1;i++) {

			for(int j=1;j<=n;j++) {
				if(i+j>=n+1 && i-j<=n-1) 
				---> "If you want "Hollow Inverted Left Pascal Triangle",' just replace if(i+j>=n+1 && i-j<=n-1)  with if(i+j<=n+1 || i-j>=n-1) . The remaining code stays the same; do not change anything else
				---> "If you want "Hollow  Left Pascal Triangle",' just replace if(i+j>=n+1 && i-j<=n-1)  with if(i+j==n+1 || i-j==n-1 || j == n) . The remaining code stays the same; do not change anything else
					System.out.print("*"+" ");
				else 
					System.out.print(" "+" ");
			}
			System.out.println();
		}

 * 
 * Enter the value of n
5
        * 
      * * 
    * * * 
  * * * * 
* * * * * 
  * * * * 
    * * * 
      * * 
        * 

 */
