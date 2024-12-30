package com.tyss.PiramidPatterns;

import java.util.Scanner;

public class PyramidNumberPattern {
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

				if (i >= a)
					System.out.print(a+1+" ");
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
 *  int a=1;
		for(int i=1;i<=n;i++) {
			a=i+1;
			for(int j=1;j<=2*n-1;j++) {
			
				if(i+j>=n+1 && j-i<=n-1) {
				
					if(j<=n) {
						a--;
						System.out.print(a+" ");
					}
					else {
					
						a++;
						System.out.print(a+" ");
					}
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

 * 
 Enter the value of n
5
        1         
      2 1 2       
    3 2 1 2 3     
  4 3 2 1 2 3 4   
5 4 3 2 1 2 3 4 5 



 */

