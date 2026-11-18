package lr1;

import java.util.Scanner;

public class Example10 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Write num1: ");
        int num1 = in.nextInt();

        System.out.print("Write num2: ");
        int num2 = in.nextInt();

        System.out.printf("%d,%d",num1+num2,num1-num2);
    }
}
