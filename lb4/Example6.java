package lr4;

import java.util.Random;

public class Example6 {
    static void main() {
        Random random = new Random();
        int width=4;
        int height=4;

        int[][] mas = new int[height][width];

        for (int i=0;i<height;i++){
            for (int j=0;j<width;j++){
                mas[i][j]= random.nextInt(100);
                System.out.printf("%d ",mas[i][j]);
            }
            System.out.print("\n");
        }

        int delwidth = random.nextInt(width);
        int delheight = random.nextInt(height);

        System.out.printf("Delete index [%d][%d]\n",delwidth,delheight);

        int[][] result = new int[height - 1][width - 1];

        int newI=0;
        for (int i=0;i<height;i++){
            if (i==delheight){
                continue;
            }
            int newJ=0;
            for (int j=0;j<width;j++){
                if (j==delwidth){
                    continue;
                }
                result[newI][newJ]= mas[i][j];
                newJ++;
            }
            newI++;
        }
        for (int i=0;i<height-1;i++){
            for (int j=0;j<width-1;j++){
                System.out.printf("%d ",result[i][j]);
            }
            System.out.print("\n");
        }

    }
}
