package lr4;

public class Example4 {
    static void main() {
        int size=10;

        String[][] mas = new String[size][size];
        for (int i=0;i<size;i++){
            int b = i;
            for (int j=0;j<b;j++){
                mas[i][j]="[]";
                System.out.print(mas[i][j]);
            }
            System.out.print("\n");
        }
    }
}
