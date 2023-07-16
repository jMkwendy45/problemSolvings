package chapterFive;

public class DivisibleBy3 {
        public static void main(String[] args) {
            int[] numbers = new int[30];  // create an array to hold the numbers from 1 to 30
            int sum = 0;

            // fill the array with numbers from 1 to 30
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = i + 1;
            }

            // calculate the sum of numbers divisible by 3
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 3 == 0) {
                    sum += numbers[i];
                }
            }

            System.out.println(sum);
        }
    }


