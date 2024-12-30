package com.tyss.DaimandMirrorTypePatterns;

import java.util.Scanner;

public class DiamondPalindromicPatterns {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		
		for(int i=1;i<=2*n-1;i++)
		{
			int a=0;
			for(int j=1;j<=2*n-1;j++)
			{
			
				if(i+j>=n+1 && j-i<=n-1 && i-j<=n-1 && i+j<=3*n-1)
				{
					if(j<=n)
					{
						a++;
						System.out.print(a+" ");
					}
					else
					{
						a--;
						System.out.print(a+" ");
					}
				}
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
	}
}
/*
 *      1         
      1 2 1       
    1 2 3 2 1     
  1 2 3 4 3 2 1   
1 2 3 4 5 4 3 2 1 
  1 2 3 4 3 2 1   
    1 2 3 2 1     
      1 2 1       
        1         

 */
