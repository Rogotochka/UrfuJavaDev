package lr1;

import java.util.Scanner;

public class Example3 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input day of the week: ");
        String dayoftheweek = in.nextLine();

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input day: ");
        int day = in.nextInt();

        System.out.printf("Date: %s %s %d", dayoftheweek, month, day);
        in.close();
    }
}
