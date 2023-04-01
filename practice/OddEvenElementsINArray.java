package practice;

public class OddEvenElementsINArray {
public static void main(String[] args) {
	int array[] = {1,2,3,4,5,6,7};
	for(int i=0;i<array.length;i++) {
		if(array[i]%2!=0) {
			System.out.println("the odd element are"+ array[i]);
		}
		else if(array[i]%2==0){
			System.out.println("the even elements are "+ array[i]);
		}
	}
}
}
