package ex_14_Strings;

import java.awt.*;

public class Lab140_Interview_P1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4  = "Hello";   // in this case, String value name is same, so only 1 String is available in SCP
        String s10 = "Hello";
        String s11 = "hello"; // now it will 2 Strings.

        // 2 , OA (Heap  Area)
        String s2 = new String("Hello");
        String s3 = new String( "Hello");
        String s5 = new String( "Hello");

        // for every "new" object, string will be stored.



    }
}
