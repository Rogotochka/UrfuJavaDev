package lr4;

public class Example3 {
    static void main() {
        int width=23;
        int height=11;

        int[][] mas = new int[height][width];

        for (int i=0;i<height;i++){
            for (int j=0;j<width;j++){
                mas[i][j]=2;
                System.out.print(mas[i][j]);
            }
            System.out.print("\n");
        }
    }
}
