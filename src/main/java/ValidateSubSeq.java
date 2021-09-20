import java.util.Arrays;
import java.util.List;

public class ValidateSubSeq {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
        System.out.println(isValidSubsequence(array,sequence));
    }
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        int seqIdx = 0;
        for(int value : array){
            if( seqIdx == sequence.size()){
                break;
            }
            if(sequence.get(seqIdx).equals(value)){
                seqIdx++;
            }
        }
        return seqIdx == sequence.size();
    }

}
