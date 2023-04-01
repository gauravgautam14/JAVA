package practice;

import java.util.Scanner;

public class NoOfDaysInaGivenMonth {
public static void main(String[] args) {
	System.out.println("enter  the month:");
	Scanner sc = new Scanner(System.in);
	int month = sc.nextInt();
	System.out.println("enter the  year:");
	int year = sc.nextInt();

	if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
 {
		System.out.println("29");
	}
	else if(month==2)
		System.out.println("28");
	else if(month==1|| month==3 || month==5|| month==7||month==8||month==10||month==12)
		System.out.println("31");
	else
		System.out.println("30");
	
}
}
