import java.util.Arrays;
import java.util.HashMap;

public class TargetSum {

    public static void main(String[] args) {

        int[] nums = {1,3,7,2,9}; // How to declare array of primitive integer
        System.out.println(Arrays.toString(getIndexOfTargetSum(nums,11))); // How to print primitive integer array

    }
    public static int[] getIndexOfTargetSum(int[] nums, int target){
        HashMap<Integer,Integer> numberTargetDiffMap = new HashMap<Integer, Integer>();
        for(int i=0;i < nums.length ; i++){
            Integer currentNumber = numberTargetDiffMap.get(nums[i]);
            if(currentNumber != null ){
                return new int[]{currentNumber,i}; // Create and return array of primitive integer
            }else{
                int numberDiffKey = target - nums[i];
                numberTargetDiffMap.put(numberDiffKey,i);
            }
        }
        return null;
    }
}
