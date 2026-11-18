package timus;

import java.util.Scanner;

public class task_1293 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Amount panels: ");
        int amount = in.nextInt();

        System.out.print("Lingth: ");
        int lingth = in.nextInt();

        System.out.print("Width: ");
        int Width = in.nextInt();

        System.out.printf("Count thorium sulfide: %d", amount*lingth*Width*2);

    }
}
