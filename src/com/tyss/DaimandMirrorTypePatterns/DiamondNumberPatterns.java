package com.tyss.DaimandMirrorTypePatterns;

import java.util.Scanner;

public class DiamondNumberPatterns {
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
					System.out.print(b+1 + " ");

				else

					System.out.print(" " + " ");

			}
			System.out.println();

		}
		 

	}

}
/*
 * second logic by using Co-Oridinates and using 2 loops 
		int a = 1;
			for (int i = 1; i <= 2 * num - 1; i++) {
			
				if(i<=num)
						a=i+1;
					else
						a=(2*num)-i+1;

					for (int j = 1; j <= 2 * num - 1; j++) {
						if (i + j >= num + 1 && i - j <= num - 1 && j - i <= num - 1 && i + j <= 3 * num - 1) {
							if(j<=num)
							{
								a--;
								System.out.print(a+" ");
							}
							else
							{
								a++;
								System.out.print(a+" ");

							}

						}

						else {
							System.out.print(" "+" ");
						}
					}
					System.out.println();
				}
		Example:-
		 Enter a Number
5
        1         
      2 1 2       
    3 2 1 2 3     
  4 3 2 1 2 3 4   
5 4 3 2 1 2 3 4 5 
  4 3 2 1 2 3 4   
    3 2 1 2 3     
      2 1 2       
        1         

		
*/

