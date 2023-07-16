package LeetCode;

public class RearrangeString {
    public static void main(String[] args) {

        String word = "codelect";
        int[] array = {4, 5, 6, 7, 0, 1, 2, 3};

        System.out.println(displayWord(word,array));
    }
    public static String displayWord (String wordArr, int[]arr) {
       StringBuilder word = new StringBuilder();
        for (int i = 0; i < arr.length ; i++) {
            word.append(wordArr.charAt(arr[i]));
        }
        return word.toString();
    }
}
