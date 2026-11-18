package lr1;

import java.util.Scanner;

public class Example2 {

    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input age: ");
        int age = in.nextInt();

        System.out.printf("Hello %s, Your age: %d", name, age);
        in.close();
    }
}
