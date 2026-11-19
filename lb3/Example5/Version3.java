package lr3.Example5;

import java.util.Scanner;

public class Version3 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print(": ");
        int n = in.nextInt();

        int sum=0;
        int i = 1;

        if (n>0){
            do{
                if (i%5==2 || i%3==1){
                    System.out.printf("%d ",i);
                    sum = sum +i;
                }
                i++;
            } while (i<=n);
        }
        System.out.printf("Sum=%d",sum);
        in.close();
    }
}
