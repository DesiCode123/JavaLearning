package StarsPractice.uke1;

import java.util.Scanner;
import java.util.SortedMap;

public class CountWord{
    public static void main(String[] args) {
        System.out.println("Kan du skrive en settning");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();


        int coutWord = 1;
            for(int i = 0;i <input.length();i++){
                char ch = input.charAt(i);
                if(ch== ' '){
                    coutWord++;
                }

        }
        System.out.println(coutWord);
    }
}
