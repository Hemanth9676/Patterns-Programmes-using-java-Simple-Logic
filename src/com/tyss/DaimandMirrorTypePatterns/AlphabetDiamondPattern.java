package com.tyss.DaimandMirrorTypePatterns;

import java.util.Scanner;

public class AlphabetDiamondPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = sc.nextInt();

		for (int i = (-n) + 1; i < n; i++) {
			int a = i;
			if (a < 0)
				a = -a;
			a = a - (n - 1);
			if (a < 0)
				a = -a;
			char ch = 'A';
			ch--;
			for (int j = (-n) + 1; j < n; j++) {
				int b = j;
				if (b <= 0) {
					ch++;
					b = -b;
				}
				else
					ch--;

				if (a <= b) 
					System.out.print(ch + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}
}
/*
 * enter the value of n
5
A B C D E D C B A 
A B C D   D C B A 
A B C       C B A 
A B           B A 
A               A 
A B           B A 
A B C       C B A 
A B C D   D C B A 
A B C D E D C B A 
 */
