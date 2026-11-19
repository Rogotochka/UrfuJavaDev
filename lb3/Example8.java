package lr3;

import java.util.Scanner;

public class Example8 {
    static void main() {
        int n = 10;
        char ch='B';

        char[] arr = new char[n];

        for (int i=0; i<n; ch++){
            if (ch!='A'&&ch!='E'&&ch!='I'){
                arr[i] = ch;
                i++;
            }
        }
        for (int i=0;i<n;i++){
            System.out.printf("%s ",arr[i]);
        }
    }
}
