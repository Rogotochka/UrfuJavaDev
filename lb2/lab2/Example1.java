package lab2;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Print number: ");
		int num = in.nextInt();
		
		if (num%3==0) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
	}

}
