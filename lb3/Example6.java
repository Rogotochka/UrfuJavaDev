package lr3;

import java.util.Scanner;

public class Example6 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int mas;
        do{
            System.out.print("Print mas: ");
            mas = in.nextInt();
            if (mas<=0){
                System.out.print("Error, print mas >= 1");
            }
        }while (mas <= 0);

        int[] arr = new int[mas];

        for (int i = 0; i<mas; i++){
            arr[i] = 2+i*5;
        }
        for (int i=0;i<mas;i++){
            System.out.printf("%d ",arr[i]);
        }
    }
}
