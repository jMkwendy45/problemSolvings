package LeetCode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] num = {3, 2, 2, 3, 3, 3, 3, 7};

        int n = num.length;
        int b = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == num[i + 1]) {
               num[i] = num[n - 1];
                continue;

//            } else {
//                i++;
            }
              i++;
            System.out.println(Arrays.toString(num));
        }


    }
    }
