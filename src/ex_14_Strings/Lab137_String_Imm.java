package ex_14_Strings;

public class Lab137_String_Imm {
    public static void main(String[] args) {

        String s1 = "hello";
        s1 = s1.concat("world");
        System.out.println(s1);
//here concat the Hello with world and there are 2 strings will be stored in SCP (String Constant Pool)
// 2 strings are Hello & Helloworld


    }
}
