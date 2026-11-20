package lr4;

import java.util.Random;

public class Example7 {
    static void main() {
        Random random = new Random();
        int width=4;
        int height=4;

        int[][] mas = new int[height][width];

        int num=1;

        for (int i=0;i<height;i++){
            if (i%2==0){
                for (int j=0; j<width; j++) {
                    mas[i][j] = num++;
                }
            }else {
                for (int j=width-1; j>=0; j--) {
                    mas[i][j] = num++;
                }
            }
        }
        for (int i=0;i<height;i++){
            for (int j=0;j<width;j++){
                System.out.printf("%d ",mas[i][j]);
            }
            System.out.print("\n");
        }


    }
}
