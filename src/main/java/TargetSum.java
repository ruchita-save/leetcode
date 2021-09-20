import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TargetSum {

    public static void main(String[] args) {

        int[] nums = {1,3,7,2,9}; // How to declare array of primitive integer
        System.out.println(Arrays.toString(getIndexOfTargetSum(nums,11))); // How to print primitive integer array
        System.out.println(Arrays.toString(twoNumberSum(nums,11))); // return numbers

    }
    public static int[] getIndexOfTargetSum(int[] nums, int target){
        HashMap<Integer,Integer> numberTargetDiffMap = new HashMap<Integer, Integer>();
        for(int i=0;i < nums.length ; i++){
            Integer currentNumber = numberTargetDiffMap.get(nums[i]);
            if(currentNumber != null ){
                return new int[]{currentNumber,i}; // Create and return array of primitive integer
            }else{
                int numberDiffKey = target - nums[i];
                numberTargetDiffMap.put(numberDiffKey,i); // Used HashMap to store index of numbers
            }
        }
        return null;
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        HashSet<Integer> diffStore = new HashSet<>(); // Hash Map is not required as numbers can be returned directly
        for(int num : array){
            int potentialMatch = targetSum - num;
            if(diffStore.contains(potentialMatch)){
                return new int[] {potentialMatch , num};
            } else {
                diffStore.add(num);
            }

        }
        return new int[0];
    }


}
