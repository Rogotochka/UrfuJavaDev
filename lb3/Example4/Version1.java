package lr3.Example4;

import java.util.Scanner;

public class Version1 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("First num: ");
        int a = in.nextInt();
        System.out.print("Second num: ");
        int b = in.nextInt();

        for (int i=a;i<=b;i++){
            System.out.printf("%d ",i);
        }
        in.close();
    }
}
