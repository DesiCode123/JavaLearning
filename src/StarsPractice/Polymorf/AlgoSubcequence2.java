package StarsPractice.Polymorf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgoSubcequence2 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 4, 56, 7));
        List<Integer> seq = new ArrayList<>(Arrays.asList(1, 4, 7));
        System.out.println(subSec(array,seq));

    }

    public static boolean subSec(List<Integer> array, List<Integer> seqArray) {
        int seqIdx = 0;
        for (int nums : array) {
            if (seqIdx == seqArray.size()) {
                return true;
            }
            if (seqArray.get(seqIdx).equals(nums)) {
                seqIdx++;
            }


        }
        return seqIdx == seqArray.size();


    }

}
