package ex_14_Strings;

public class Lab141_String_Interview_P2 {
    public static void main(String[] args) {
        String s1 = "Hello"; // only 1 string
        String s4 = "Hello";

        String s2 = new String( "Hello");
        String s3 = new String( "Hello"); // 3 Strings
        String s5 = new String("hello");

        // now  total 4 Strings,

        // == -> Comparison ->  String => this check the ref location

        System.out.println(s1 == s3); // both stored value location are not same.// false
        System.out.println(s1 == s2); // false

        System.out.println(s2 == s3);// true
        System.out.println(s3 == s5); // true

        //equals ( content) -> value (here is checking the string values are same or not)

        System.out.println(s1.equals(s2));// true
        System.out.println(s1.equals(s3)); // true

        System.out.println(s3.equals(s5));// false
        System.out.println(s3.equalsIgnoreCase(s5)); //true   )which mean ignoring the case, s3 is equal to s5


// equalsIgnoreCase -> Pramod. Pramod, PRAMOD, Pramod, PromoD-> pramod
// == -check for the ref
// == assignment the value.


    }
}
