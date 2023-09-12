package StarsPractice;

public class MiddleStar {
    public static void main(String[] args) {
        String s = "*";
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");

            }
           /* for (int k = 0; i > k; k++) {
                System.out.print(s);
            }*/
            for (int l = 0; i + 1 > l; l++) {
                System.out.print(s + " ");

            }
            System.out.println();
        }
    }
}
//i = 0-->1
//i =1 -->2
//i =2-->3
// i =3-->4
// i =4 -->5