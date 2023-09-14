package StarsPractice.Polymorf;


import java.util.Scanner;

/*
Grunnleggende syntaks og oppgaver:

Skriv en Java-metode som inverterer en streng.
Forklar forskjellen mellom == og equals() i Java.
Hvordan lager du en uendelig løkke med en for-setning?
 */



public class Equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String test = "hello";
        boolean output = referenceCompare(input,test);  // Fixed the syntax error here
        System.out.println("The two strings are : " + output);
        boolean equalsOut = stringEquals(input,test);
        System.out.println(equalsOut);
        uendeligLokke();
    }

    // Consider renaming this method to avoid confusion with the built-in equals method
    public static boolean stringEquals(String input, String test){
        return input.equals(test);  // Simplified the return statement
    }

    public static boolean referenceCompare(String input, String anything) {
        return input == anything;  // Simplified the return statement
    }

    public static int uendeligLokke() {
        while (true) {
            System.out.println("uendelig løkke");
        }
    }
}

