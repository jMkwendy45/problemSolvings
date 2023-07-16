package Stringln;

public class Literals {
    public static void main(String[] args) {

        String name = "elites";
        String name3 = "Elite";
        String name4 = new String("elites").intern();


  if (name==(name4)){
     System.out.println(true);
  }
else
     System.out.println(false);

System.out.println(name3.length());
        System.out.println(name.charAt(0));
        System.out.println(name.compareTo(name3));


//        String s1 = "hello there";
//        char[] charArray = new char[5];
//        System.out.printf("s1: %s", s1);
//            // test length method
//        System.out.printf("%nLength of s1: %d" );
//
//            // loop through characters in s1 with charAt and display reversed
//             System.out.printf("%nThe string reversed is: ");
//
//             for (int count = s1.length() - 1; count >= 0; count--) {
//                 System.out.printf("%c ",s1 );
//                }
//            // copy characters from string into charArra
//             System.out.printf("%nThe character array is: ");
//            for (char character : charArray) {
//                System.out.print(character); mn0
//
//
//
//
//                }System.out.println();
//             }
    }
}



