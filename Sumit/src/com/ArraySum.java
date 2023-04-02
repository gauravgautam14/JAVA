package com;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {

		System.out.println("Enter the number of elements");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int k = 0; k < n; k++) {
			int[] ar1 = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.println("Enter the element at index" + i);
				ar1[i] = sc.nextInt();
			}
			System.out.println("Enter the 2nd array element");
			int[] ar2 = new int[n];
			for (int j = 0; j < n; j++) {
				System.out.println("Enter the element at index" + j);
				ar2[j] = sc.nextInt();
			}
         int[] ar3=new int[n];
         for(int l=0;l<n;l++) {
        	 ar3[l]=ar1[l]+ar2[l];
        	
        	 System.out.println(ar3[l]);
         }
         break;
		}

	}
}
