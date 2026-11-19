package lr3.Example4;

import java.util.Scanner;

public class Version2 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("First num: ");
        int a = in.nextInt();
        System.out.print("Second num: ");
        int b = in.nextInt();
        if (a <= b) {


            do {
                System.out.printf("%d ", a);
                a++;
            } while (a <= b);
        }
        in.close();
    }
}
