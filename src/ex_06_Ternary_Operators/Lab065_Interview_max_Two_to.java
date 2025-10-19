package ex_06_Ternary_Operators;

public class Lab065_Interview_max_Two_to {
    public static void main(String[] args) {
       // Find the maximum number between 2 numbers.
        int x =10;
        int y = 20;

      //  System.out.println(Math.max(x,y));

        //Math  is liabrary in Java, not required to import Math Package explicitly
       //import java.lang.Math;
        // in ternary operators, we can also write

        int max =  x > y ? x : y;
        System.out.println(max);

    }
}
