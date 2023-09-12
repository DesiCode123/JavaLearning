import java.util.Arrays;
import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String userInput = s.nextLine();
        char[] charArray = userInput.toCharArray();
        System.out.println(Arrays.toString(charArray));
        String t = "";
        for( int i = charArray.length -1; i>= 0;i--) {
            //System.out.print(charArray[i]);
            t+=charArray[i];

        }
        if(userInput.equals(t)){
            System.out.println("String is Paindrom");
        }
        else {
            System.out.println("not palindrom");
        }

        }

    }

