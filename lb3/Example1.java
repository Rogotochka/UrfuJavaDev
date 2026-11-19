package lr3;

import java.util.Scanner;

public class Example1 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Print num(1-7): ");
        int day = in.nextInt();

        switch (day){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.println("Error");
        }
        in.close();
    }
}
