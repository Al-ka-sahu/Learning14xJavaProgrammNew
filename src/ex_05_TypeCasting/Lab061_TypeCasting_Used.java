package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {

    public static void main(String[] args) {

        int course = 100;
        float GST = 18.45f;

        //int Total1 = course+GST; // narrowing ->  implicit casting = automatic = not valid

        int Total = course + (int) GST; // Narrowing -> explicit Casting = Valid Syntax

        // Store the value in small bucket that why required explicitly store the value with help of int

        float Total2 = course+GST;  // Widening Implicit Casting = Automatic
        // Store the value in big basket float

        // float total2 = (float) course+GST; // widening explicitly = valid syntax

        System.out.println(Total); //118
        System.out.println(Total2); //118.45



    }
}
