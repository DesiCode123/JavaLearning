package StarsPractice;

public class UpDownStars {
    public static void main(String[] args) {
        String p = "*";
        for(int i = 0; i < 5;i++){
            for(int j = 4;j>i;j--){
                System.out.print(" ");

            }
            for( int k = 0;i >=k; k++){
                System.out.print(p);
            }
            System.out.println();
        }
    }
}
