import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner userInp = new Scanner(System.in);

        int nummber = userInp.nextInt();
        boolean p = false;

        for (int i = 2; i < nummber - 1; i++) {
            if (nummber % i == 0) {
                p = true;
                break;
            }
        }
        if (p == true) {
            System.out.println("its not a prime number");
        }else {
            System.out.println("its a prime number");
        }
    }
}
