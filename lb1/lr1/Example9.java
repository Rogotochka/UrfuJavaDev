package lr1;

import java.util.Scanner;

public class Example9 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Write num: ");
        int num = in.nextInt();

        System.out.printf("%d,%d,%d",num-1,num,num+1);
    }
}
