package StarsPractice.Polymorf;

import java.util.Arrays;

public class AlgoTarget {
    public static void main(String[] args) {
        int[] array = {-4,-1,1,3,5,6,8,11};
        int targetsum = 11;
        System.out.println(Arrays.toString(targetSum(array, targetsum)));
    }

    // Time = O(n^2) time O 1 space
    public static int[] targetSum(int[] array,int targetsum){
        for(int i =0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){ // changed array.length-1 to array.length
                if (targetsum == array[i]+array[j]){
                    return new int[]{array[i],array[j]};
                }
            }
        }
        return new int[0];
    }
}
