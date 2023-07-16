package LeetCode;

import java.util.Arrays;

public class TwoSums {
    public static void main(String[] args) {
        int[] nums = {2, 7, 8, 9, 7, 6, 9};
        int target = 14;
//        System.out.println(Arrays.toString(sum(array, target)));
//    }

//    public static int[] sum(int[] nums, int target) {
        int i;
        int j = 0;
        int temp = 0;
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[i]==target) {

                }
            }
        }
        System.out.println(temp);
    }
}








        //                if (nums[j]==target- nums[i]){

//                  return new int[]{i,j};


//        }
//        throw new IllegalArgumentException("no two sum sol");