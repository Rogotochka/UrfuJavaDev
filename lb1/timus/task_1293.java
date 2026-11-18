package timus;

import java.util.Scanner;

public class task_1293 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        int lingth = in.nextInt();
        int Width = in.nextInt();

        System.out.printf("Count thorium sulfide: %d", amount*lingth*Width*2);

    }
}
