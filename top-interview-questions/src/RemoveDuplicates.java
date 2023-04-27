import java.util.Arrays;
import java.util.Stack;

/*
Remove-Duplicates-from-Sorted-Array
https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
 */
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int ptx1 = 0;
        int length = nums.length;
        for (int i = 0; i<length; i++){
            if (nums[ptx1] != nums [i]){
                nums[ptx1+1] = nums [i];
                ptx1++;
            }

        }
        System.out.println(ptx1+" "+Arrays.toString(nums));

        return ptx1;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,2};
        removeDuplicates(nums);
    }
}