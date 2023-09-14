package StarsPractice.uke1;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        String input = "hello sharmila";
        int words = countWords(input);
        System.out.println("words " + words);

    }

    public static int countWords(String input) {
        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ') {
                count++;
            }
        }
        return count;
    }
}
