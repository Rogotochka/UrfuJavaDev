package lr4;

import java.util.Random;

public class Example5 {
    static void main() {
        Random random = new Random();
        int width=23;
        int height=11;

        int[][] mas = new int[height][width];

        for (int i=0;i<height;i++){
            for (int j=0;j<width;j++){
                mas[i][j]= random.nextInt(100);
                System.out.printf("%d ",mas[i][j]);
            }
            System.out.print("\n");
        }
        for (int i=0;i<width;i++){
            for (int j=0;j<height;j++){
                System.out.printf("%d ",mas[j][i]);
            }
            System.out.print("\n");
        }
    }
}
