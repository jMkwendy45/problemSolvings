package LeetCode;

import java.util.Scanner;

public class ReverseListInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();
        System.out.println("the reversed number is "+anotherReverse(number));
    }

        public static  int anotherReverse(int number){
        int reverse = 0;
        while(number != 0){
            int remainder = number %10;
            reverse = reverse *10 + remainder;

            number = number/10;
        }
        return reverse;
        }


    }

