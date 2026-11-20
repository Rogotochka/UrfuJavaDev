package lr4;

import java.util.Scanner;

public class Example8 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Entry text: ");
        String text = in.nextLine();
        System.out.print("Entry key: ");
        int key = in.nextInt();

        key = key % 26;
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + (c - 'A' + key) % 26);
            } else if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c - 'a' + key) % 26);
            }

            result += c;
        }
        System.out.printf("Text encrypted: ",result);

    }
}
