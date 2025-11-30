package ex_13_Functions;

public class Lab131_User_Defined_One {
    public static void main(String[] args) {
        // when return values are hardcoded.
        int result = sum_of_two_number();  // fetch hardcoded value
        System.out.println(result);

        int result1 = sum_of_two_number(50, 16);  // Parameter value
        System.out.println(result1);

        // same parametrized function can be used again with different value.
        int result2 = sum_of_two_number(5, 6);
        System.out.println(result2);

        newsum_of_two_number(); // no return value only statement will be print.

    }

   static int sum_of_two_number() {
    return 10 + 20;    // value are hardcoded that why return 30 only

    }

    // also we can take the value from outside, as parameters.
    static int sum_of_two_number(int a, int b) {
        return a + b; // same function can be reusable again with differ values.

    }

    static void newsum_of_two_number(){
        System.out.println("hi, there");
    }


}

//same function can be used as parameter, non parameter with return type (this is call method overloading)                                                                          jm                                                                                           mjm
// but can't use non parameter with void
//can't pass incompatible datatypes in parameter.

