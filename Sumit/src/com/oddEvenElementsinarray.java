package com;

public class oddEvenElementsinarray {
	public static void main(String[] args) {
		int[] arr= {1,2,4};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println("The odd elements are\n"+arr[i]);
			}
			else if(arr[i]%2==0) {
				System.out.println("the even elements are\n"+arr[i]);
			}
		}
	}

}
