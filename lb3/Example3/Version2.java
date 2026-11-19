package lr3.Example3;

import java.util.Scanner;

public class Version2 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print(": ");
        int n = in.nextInt();

        int a = 1;
        int b = 1;
        int c = 0;
        int i = 0;

        while (i < n) {
            System.out.printf("%d ",a);

            c = a + b;
            a = b;
            b = c;
            i++;
        }
        in.close();
    }
}
