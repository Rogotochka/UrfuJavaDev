package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example7 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Your age: ");
        int age = in.nextInt();

        System.out.print(LocalDate.now().getYear()-age);
    }
}
