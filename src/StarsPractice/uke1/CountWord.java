package StarsPractice.uke1;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        System.out.println("Skriv in en senting du vil telle ordene for:");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        int wordCount = countWords(userInput);
        System.out.println("Antall ord i setningen er: " + wordCount);

    }

    public static int countWords(String input) {
        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ') {
                count++;
            }
        }
        return count;
    }

}
