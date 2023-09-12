import java.util.Scanner;

public class LoopsPractice {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
/*
        int sum = 0;
        int nummer = 0;
        do {
            nummer =userInput.nextInt();
            sum +=nummer;

        }while(nummer != 0);
        System.out.println(sum);*/

        int sum1 = 0;
        int num1 = 1;
        while(num1 !=0){
            num1 = userInput.nextInt();
            sum1 +=num1;
        }
        System.out.println(sum1);



    }
}
