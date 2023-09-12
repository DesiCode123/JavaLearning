package StarsPractice.uke1;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        //System.out.println("skriv inn ord eller setning");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        int countChat =countLetters(userInput);
        System.out.println("Her er antall bokstaver: "+countChat);
 }

    public static int countLetters(String input) {
        int count = 0;
        for(int i = 0;i < input.length();i++){
            char ch = input.charAt(i);
            if(ch != ' '){
                count++;
            }
        }
        return count;
    }
}

