package LeetCode;

import java.util.Arrays;

public class MergeSorted {
    public static void main(String[] args) {


        int[] num1 = {1, 0, 3, 0, 0, 0};
        int m = 3;
        int[] num2 = {4, 5, 6};
        int counter;
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                        if ( i == m) {
                            System.out.println(i);
                            num1[i]   =    num2[j];
                            i++;
                            m++;

//                        }
                    }
//                num1[i]   =    num2[j];

                }
            }

            System.out.println(Arrays.toString(num1));
            for (int k = 0; k < num1.length; k++) {
                for (int l = k + 1; l < num1.length; l++) {
                    if (num1[k] > num1[l]) {
                        counter = num1[k];
                        num1[k] = num1[l];
                        num1[l] = counter;

                    }

                }
            }

            System.out.println("scnd" + Arrays.toString(num1));

        }

    }



