package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {

    public static void main(String[] args) {

        int val = 300;

       // byte b = val; // Narrowing - Implicit Casting - automatically but not valid

        byte b = (byte) val; // Narrowing - Explicit Casting- (explicitly done) and valid syntax

        // tell to JVM that explicitly done

       // how to store the 300 value in byte while doing narrowing casting
        /*
        * 300 value convert in byte , which will be 4 byte = 32 bits
        * 32 bits -> 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 1 0 1 1 0 0
        *  only last 8 bits value only pick
        *  00101100
        *  0+0+32+0+8+4+0+0 = 44.
        *  (00101100)2 = 44
        * */




    }
}
