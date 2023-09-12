package StarsPractice;

public class NummersPattern {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k < i; k++) { // O(n)
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++) { //1<6 ,2<6,3<6, 2<6  Time comp O(n)
                System.out.print(j + " ");

            }

            System.out.println();
        }
    }
}
// O(n)^2