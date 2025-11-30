package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
      non_return_type_function();
      String name  = return_string_type_function();
        System.out.println("name");


//  for NON-Return type,need to call function for executing function program

// same for Return Type, need to call function and also stored the return type in some variable.
//        to show the return value.
// print is not a return type, it is just statement
     }
     static void non_return_type_function(){
         System.out.println("Hi, there, no return function!");
     }
//Return Type -which return a data type (int, String, Char, boolean, float)
    static String return_string_type_function(){
        System.out.println("Hi, there, i will return something.");

        return "Pramod";
    }
    static boolean return_boolean(){
        return true;

    }
}
