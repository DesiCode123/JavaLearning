package StarsPractice.Polymorf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgoSubcequence {
    public static void main(String[] args) {
       List<Integer> array = new ArrayList<>(Arrays.asList(1,3,4,6,7,8,8,9,9));
       List<Integer> seq = new ArrayList<>(Arrays.asList(7,8,8));
        System.out.println(subSec(array,seq));

    }
    public static boolean subSec(List<Integer> array,List<Integer> seqArray){
        int arrayIdx = 0;
        int seqIdx = 0;
        while(arrayIdx < array.size() && seqIdx < seqArray.size()){
            if(array.get(arrayIdx).equals(seqArray.get(seqIdx))){
                seqIdx++;
            }
            arrayIdx++;
        }
        return seqIdx == seqArray.size();
    }
}
