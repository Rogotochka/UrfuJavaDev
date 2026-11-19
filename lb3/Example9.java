package lr3;

import java.util.Random;

public class Example9 {
    static void main() {
        Random random = new Random();

        int n = 10;
        int[] arr = new int[n];

        for (int i=0;i<n;i++){
            arr[i] = random.nextInt(100);
        }
       System.out.printf("Массив: ");

        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        int min = arr[0];

        for (int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.printf("\nMin: %d ",min);
        System.out.printf("Индекс минимальных элементов: ");

        for (int i = 0;i<n;i++){
            if (arr[i] == min){
                System.out.printf("%d ",i);
            }
        }
    }
}
