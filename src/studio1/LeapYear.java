package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What's the year in question?"); 
		int x = in.nextInt(); 
		boolean y = (x%4 == 0); 
		boolean z = (x%100 == 0);
		System.out.println(x + " is a leap year: " + (y && !z)); 
		

	}

}
