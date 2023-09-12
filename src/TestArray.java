import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {

        String[] sArray = new String[5];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i< sArray.length; i++){
            String userIn = s.nextLine();
            sArray[i] = userIn;

        }
        for (int j = 0; j < sArray.length; j ++){
            System.out.print( sArray[j] + " ");
        }

    }
}
