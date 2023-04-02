package com;

public class ArrayOddSum {
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7};
		int sum=0;
		for(int i=0;i<array.length;i++)
			if(array[i]%2!=0) {
				System.out.println(array[i]);
				sum+=array[i];
				
			}
		System.out.println("The above are the odd elements and sum of above odd elements are"+sum);
	}

}
