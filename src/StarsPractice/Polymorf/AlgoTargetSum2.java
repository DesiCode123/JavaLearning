package StarsPractice.Polymorf;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//O(n)tim O(n) space
public class AlgoTargetSum2 {
    public static void main(String[] args) {
        int[] array = {2,4,3,8};
        int targetsum = 11;
        System.out.println(Arrays.toString(targetSum(array,targetsum)));
    }

    public static int[] targetSum(int[]array,int targetsum){
        Set<Integer> nums = new HashSet<>();//run fast, more space
        for(int num:array){
            int potensialMatch = targetsum - num;
            if(nums.contains(potensialMatch)){
                return new int[]{potensialMatch,num};
            } else {
                nums.add(num);
            }

        }
        return new int[0];

    }
}
