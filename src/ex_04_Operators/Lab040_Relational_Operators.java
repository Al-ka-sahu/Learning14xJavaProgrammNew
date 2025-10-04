package ex_04_Operators;

public class Lab040_Relational_Operators {
    public static void main(String[] args) {
/*
        <  Less Than
        <=    -> Less Than or equal to
        >   greater than
        >=  greater than or equal to
        == -> equal to (but checking)
        != -> not Equal

        */
        int a = 30;
        int b = 20;
        boolean c = a > b;  //(30>20)
        System.out.println(c);  // o/p = true

        int age_mamita = 33;
        int age_promod = 34;

        boolean result = age_promod >=age_mamita;  //(34>=33)
        System.out.println(result); //  o/p = true

        // Note :  relational operators which always gives the boolean result
    }
}
