package LeetCode;

import java.util.Arrays;

public class Removes {
    public static void main(String[] args) {

        int val = 3;

        int[] num = {3, 2, 2, 3, 3, 3, 3, 7};
        int i = 0;
        int n = num.length;
        while (i < n) {
            if (num[i] == val) {
                num[i] = num[n - 1];
                n--;
            } else {
                i++;
            }

        }
        System.out.println(Arrays.toString(num));
    }
}
