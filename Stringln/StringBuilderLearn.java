package Stringln;

public class StringBuilderLearn {
    public static void main(String[] args) {

        StringBuilder name = new StringBuilder("Last string\n");
        int value = 1;
        float num = 1.444f;
        Object obj = "Hello";
//       ); name.append(value);
//        name.append("\n");
//        name.append(num) ;
//        name.append("\n");
//        name.append(obj);
//        System.out.println(name



        name.insert(0,value);
        name.insert(0,num);
        System.out.println(name);
    }
}
