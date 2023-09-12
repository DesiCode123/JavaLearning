public class Star {
    public static void main(String[] args) {
        String p = "*";
        for (int i = 0; i < 5; i++) {

            for (int j = 5; j > i + 1; j--) {
                // 5 > 1
                // 4 > 1
                // 3 > 1
                // 2 > 1
                // 1 > 1


                System.out.print(" ");
            }
            for(int k = 0; k < i + 1; k++) {
                System.out.print(p);

            }
            System.out.println();
        }
    }
}
