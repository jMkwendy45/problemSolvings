package problemSolving;

public class LetterOccurence {
    public static void main(String[] args) {

        String  word = "Mississippi";
        int countOFS= 0;
        int countOfI = 0;



        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i)=='s'){
                countOFS++;
            } else if (word.charAt(i)=='i') {
                countOfI++;

            }

        }
        System.out.println("the count of s is"+countOFS);
        System.out.println("the count of i is"+countOfI);

    }
}
