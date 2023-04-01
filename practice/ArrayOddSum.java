package practice;

public class ArrayOddSum {
public static void main(String[] args) {
	int sum=0;
	int array[]= {1,2,3,4,5,6,7,8};
	for(int i=0;i<array.length;i++)
		if(array[i]%2!=0) {
			System.out.println(array[i]);
			sum+= array[i];
		}
	System.out.println("the sum of all the above odd elements are"+ sum);
}
}
