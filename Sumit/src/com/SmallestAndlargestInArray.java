package com;

public class SmallestAndlargestInArray {
	static int maxarray(int[] array, int max) {
		for (int i = 0; i < array.length; i++)

		{
			if (array[i] > max)
				max = array[i];
		}

		return max;
	}
	static int minarray(int[] array, int min) {
		for (int i = 0; i < array.length; i++)

		{
			if (array[i] < min)
				min = array[i];
		}

		return min;
	}
	
	

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[] arr= {1,2,4,7,5,};
		System.out.println("max of array is"+maxarray(arr,max));
		System.out.println("max of array is"+minarray(arr, min));
	}

}
