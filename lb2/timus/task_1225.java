package timus;

import java.util.Scanner;

public class task_1225 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		if (n==1 && n == 2) {
			System.out.print("2");
		}
		else {
			long a = 2;
			long b = 2;
			for (int i = 3; i<=n; i++) {
				long next = a+b;
				a = b;
				b = next;
			}
			System.out.print(b);
		}
		in.close();
	}

}
