package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example6 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Name: ");
        String name = in.nextLine();

        System.out.print("Year: ");
        int Year = in.nextInt();

        System.out.printf("%s,%d", name, LocalDate.now().getYear()-Year);
    }
}
