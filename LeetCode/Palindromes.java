package LeetCode;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = input.nextInt();
        System.out.println(isPalindrome(number));
    }
    public  static boolean isPalindrome(int number){
        if (number<0||(number%10==0&& number!=0)){
            return  false;
        }
        int  revertedNumber = 0;
        while (number>revertedNumber){
            revertedNumber =revertedNumber*10+number%10;
            number/=10;
        }
        return number==revertedNumber|| number==revertedNumber/10;









    }
}
