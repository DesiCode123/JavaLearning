package StarsPractice.Polymorf;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class NonConstructibleChange {
    public static void main(String[] args) {
        int[] array = {5,7,1,1,2,3,22};
        System.out.println(nonConstChange(array));

    }
    public static int nonConstChange(int[] coins){
        Arrays.sort(coins);
        int currentChangeCreated = 0;
        for(int coin : coins){
            if(coin > currentChangeCreated){
                return currentChangeCreated +1;
            }
            currentChangeCreated += coin;
        }return currentChangeCreated + 1;

    }


}
