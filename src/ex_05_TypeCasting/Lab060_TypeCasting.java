package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 7879362889l;
        //short s = phone_no; // Narrowing - implict typecasting - not valid syntax

        short s = (short) phone_no; // Narrowing - Explicit Casting - valid syntax


        /**
        **/

        System.out.println(s);

    }
}
