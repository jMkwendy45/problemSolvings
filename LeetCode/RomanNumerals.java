package LeetCode;

import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your roman numeral to be converted to integer");
        String romanNumerals = input.next();
        int roman = 0;

        for (int i = romanNumerals.length() - 1; i >= 0; i--) {

            switch (romanNumerals.charAt(i)) {
                case 'M':
                    roman += 1000;
                    break;
                case 'D':
                    roman += 500;
                    break;
                case 'C':
                    roman += 100 * (roman >= 500 ? -1 : 1);
                    break;
                case 'L':
                    roman += 50;
                    break;
                case 'X':
                    roman += 10 * (roman >= 50 ? -1 : 1);
                    break;
                case 'V':
                    roman += 5;
                    break;
                case 'I':
                    roman += (roman >= 5 ? -1 : 1);
                    break;
                default:
                    break;

            }
        }
            System.out.println(roman);


    }
}
