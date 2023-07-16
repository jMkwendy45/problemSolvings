package Stringln;

public class Rgx {
    public static void main(String[] args) {

//    String name = "Elites" ;
//    String longName ="Adebayo";
//        System.out.println(name.matches("[A-z]+"));
//        System.out.println(longName.matches("[A-z]+"));
//System.out.println(name.matches("[a-z]+"));
//        System.out.println(tep.matches("[0-9]*"));
  String cohortName ="Elites";
  System.out.println(cohortName.matches("[A-Z][a-z]+"));//must start with capital letter
  String name = "Elites"  ;
  String tep = "MaliG4real";
  String phoneNumber ="0800-000-9981";
String email ="oluchi@gmail.com";
        System.out.println(name.matches("([a-z A-Z])+"));
        System.out.println(email.matches("[a-z]+@gmail.com"));
        System.out.println(phoneNumber.matches("\\d{4}-\\d{3}-\\d{4}"));
//        System.out.println(phoneNumber.matches("[0-9]"));
        System.out.println(tep.matches("([a-z A-Z0-9])+"));
        System.out.println(tep.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?!.*\\s)(?=.*[@#$^&*()_=-oil,+!~]).{8}"));
    }
}
