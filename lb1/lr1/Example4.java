package lr1;

import java.util.Scanner;

public class Example4 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Print month: ");
        String month = in.nextLine();

        System.out.print("Print amount days: ");
        int days = in.nextByte();

        System.out.printf("Month %s amount days: %d", month, days);
        in.close();

    }
}
