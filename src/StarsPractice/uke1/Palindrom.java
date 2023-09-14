package StarsPractice.uke1;

public class Palindrom {
    public static void main(String[] args) {
        String word = "radar";
        System.out.println(isPalindrom(word));

    }
    public static boolean isPalindrom(String word){
        int i = 0;
        int j = word.length() -1;
        while(i<j){
            if(word.charAt(i) != word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
