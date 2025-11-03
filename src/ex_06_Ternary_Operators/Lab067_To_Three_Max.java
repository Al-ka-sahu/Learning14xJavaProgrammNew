package ex_06_Ternary_Operators;

public class Lab067_To_Three_Max {

    public static void main(String[] args) {
        //Apply 1st LBF (Logic Building Formula)

        // Step 1 : find the input & output datatype.
        // I/O = n1, n2, n3 --> int
        // O/P = int - max number or string we can message with max number.
 // Note : we have store the int value as string form %d and print the o/p as string.


        int n1 = 12;
        int n2 = 9;
        int n3 = -11;

        //Step 2 : Rough Logic, Think about it.
        // n1 >  n2 && n1 > n3 ---- n1  (winner)
        // n2 > n3 && n2 > n1 ---- n2 (winner)
        // n3

        // Step 3 - Dry Run Program
        int max = (n1 > n2) ? ((n1 > n3)? n1 : n3) : ((n2 > n3) ? n2 : n3);
        System.out.printf("max is %d", max);

        // Check as explain this, in this case n1>n2 which means false, it will fall into 2nd expression
        // where n2 = 9 and n2>n3 and it will be true = n2 not n3
        // hence result will be n3
        // and for print the int number in the term of string form use printf and for int use %d.

// here is using multiple '?' that's why say Nested-in Ternary Operator.


        // is n3 is max then 1st expression will be run
    }

}
