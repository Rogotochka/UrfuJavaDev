package lr3.timus;

import java.util.Scanner;

public class Task_1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = (1 + a) * (Math.abs(a - 1) + 1) / 2;
        System.out.println(sum);
    }
}
