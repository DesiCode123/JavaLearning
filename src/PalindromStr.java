import java.util.Scanner;

public class PalindromStr {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String userInput = s.nextLine();
        String t = "";

        for (int i = userInput.length() - 1; i >= 0; i--) {
            t += userInput.charAt(i);
        }

        if (userInput.equals(t)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}

