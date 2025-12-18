package ex_14_Strings;

public class Lab138_Strings_Functions {
    public static void main(String[] args) {

        char c = 'A';
        System.out.println(c); // charactor will not stored in SCP (String Control Pool). it is imposter
        // it has stored the value in integer form

        String s1 = "ABCD";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase()); // here is only 2  Strings stored in SCP.
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat("E")); // here is total, 4 Strings stored in SCP.

    }
}
