package ex_06_Ternary_Operators;

public class Lab064_Interview_Ready_Question {
    public static void main(String[] args) {

        int age = 21;
        //Nested Ternary
        // result  = Condition1 ? expression1 : (condition2 ? expression2 : expression 3

        String result = (age > 18) ? (age > 25 ? "You can drink" : "you can go to Goa, but you can't drink") : "No";
        System.out.println(result);

      // this is nested if else


    }
}
