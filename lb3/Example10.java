package lr3;

import java.util.Random;

public class Example10 {
    static void main() {
        Random random = new Random();
        int n = 10;
        int[] arr = new int[n];

        for (int i =0;i<n;i++){
            arr[i]=random.nextInt(100);
        }
        for (int i =0;i<n;i++){
            System.out.printf("%d ",arr[i]);
        }
        for (int i=0;i<n-1;i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
        int temp = arr[i];
        arr[i]=arr[maxIndex];
        arr[maxIndex] = temp;
        }
        System.out.print("\n");
    for (int i=0;i<n;i++){
        System.out.printf("%d ",arr[i]);
    }
}
}
