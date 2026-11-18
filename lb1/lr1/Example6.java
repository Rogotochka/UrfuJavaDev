package lr1;

import java.util.Scanner;

public class Example1 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Input Second name: ");
        String SecondName = in.nextLine();
        System.out.println("Input First name: ");
        String FirstName = in.nextLine();
        System.out.println("Input Second name: ");
        String SurnameName = in.nextLine();

        System.out.printf("Hello %s, %s, %s", SecondName, FirstName, SurnameName);
        in.close();
    }
}
