package timus;

import java.util.Scanner;
public class task_1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        int lingth = in.nextInt();
        int Width = in.nextInt();

        System.out.printf("%d", amount*lingth*Width*2);
    }
}
