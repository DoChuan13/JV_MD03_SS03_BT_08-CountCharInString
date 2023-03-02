package CountCharInString;

import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input String: ");
        String str = input.nextLine();
        System.out.print("Input a Character: ");
        char charText = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (charText == str.charAt(i)) {
                count++;
            }
        }
        System.out.printf("%s has %d in the String %s", charText, count, str);
    }
}
