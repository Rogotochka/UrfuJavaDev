package lr3;

import java.util.Scanner;

public class Example2 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Print day of the week: ");
        String day = in.nextLine();

        switch (day){
            case "Monday":
                System.out.print("1");
                break;
            case "Tuesday":
                System.out.print("2");
                break;
            case "Wednesday":
                System.out.print("3");
                break;
            case "Thursday":
                System.out.print("4");
                break;
            case "Friday":
                System.out.print("5");
                break;
            case "Saturday":
                System.out.print("6");
                break;
            case "Sunday":
                System.out.print("7");
                break;
            default:
                System.out.println("Error");
        }
        in.close();
    }
}
