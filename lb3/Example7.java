package lr3;

import java.util.Scanner;

public class Example7 {
    static void main() {
        int n = 10;

        char[] arr = new char[n];

        for (int i =0; i<n; i++){
            arr[i] = (char) ('a'+i*2); // крч, соглазно ASCII + i*2 следующий символ
        }
        for (int i=0;i<n;i++){
            System.out.printf("%s ",arr[i]);
        }
        System.out.print("\n");
        for (int i=n-1;i>=0;i--){
            System.out.printf("%s ",arr[i]);
        }
    }
}
