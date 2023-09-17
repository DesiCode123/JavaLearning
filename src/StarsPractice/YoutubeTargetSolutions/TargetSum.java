package StarsPractice.YoutubeTargetSolutions;

public class TargetSum {Solutions:
        1)import java.util.Arrays;

    public class Program {

        public static void main(String[] args) {
            int[] array = {14, 3, 47, 7, 10, 31};
            int targetSum = 17;

            int[] result = twoNumberSum(array, targetSum);

            if (result.length == 0) {
                System.out.println("No two numbers in the array add up to the given target sum.");
            } else {
                System.out.println("The two numbers that add up to the target sum " + targetSum + " are: " + Arrays.toString(result));
            }
        }

        public static int[] twoNumberSum(int[] array, int targetSum) {
            for (int i = 0; i < array.length - 1; i++){
                int firstNum = array[i];
                for (int j = i + 1; j < array.length; j++){
                    int secondNum = array[j];
                    if (firstNum + secondNum == targetSum){
                        return new int[] {firstNum, secondNum};
                    }
                }
            }
            return new int[0];
        }
    }

2)import java.util.*;
import java.util.Arrays;

    public class Program {

        public static void main(String[] args) {
            int[] array = {14, 3, 47, 7, 10, 31};
            int targetSum = 17;

            int[] result = twoNumberSum(array, targetSum);

            if (result.length == 0) {
                System.out.println("No two numbers in the array add up to the given target sum.");
            } else {
                System.out.println("The two numbers that add up to the target sum " + targetSum + " are: " + Arrays.toString(result));
            }
        }

        public static int[] twoNumberSum(int[] array, int targetSum) {
            Set<Integer> nums = new HashSet<>();
            for (int num : array){
                int potentialMatch = targetSum - num;
                if (nums.contains(potentialMatch)){
                    return new int[] {potentialMatch, num};
                } else {
                    nums.add(num);
                }
            }
            return new int[0];
        }
    }

3)import java.util.Arrays;

    public class Program {

        public static void main(String[] args) {
            int[] array = {14, 3, 47, 7, 10, 31};
            int targetSum = 17;

            int[] result = twoNumberSum(array, targetSum);

            if (result.length == 0) {
                System.out.println("No two numbers in the array add up to the given target sum.");
            } else {
                System.out.println("The two numbers that add up to the target sum " + targetSum + " are: " + Arrays.toString(result));
            }
        }

        public static int[] twoNumberSum(int[] array, int targetSum) {
            Arrays.sort(array);
            int left = 0;
            int right = array.length - 1;
            while(left < right){
                int currentSum = array[left] + array[right];

                if(currentSum == targetSum){
                    return new int[] {array[left], array[right]};
                }else if (currentSum < targetSum){
                    left++;
                }else if (currentSum > targetSum){
                    right--;
                }
            }
            return new int[0];
        }
    }

}
