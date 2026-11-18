package lr1;

import java.util.Scanner;
import java.time.LocalDate;
public class Example5 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Year: ");
        int Year = in.nextInt();

        System.out.print(LocalDate.now().getYear()-Year);

    }
}
