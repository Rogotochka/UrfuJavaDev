package lr3.Example4;

import java.util.Scanner;

public class Version3 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("First num: ");
        int a = in.nextInt();
        System.out.print("Second num: ");
        int b = in.nextInt();

        while(a<=b){
            System.out.printf("%d ",a);
            a++;
        }
        in.close();
    }
}
