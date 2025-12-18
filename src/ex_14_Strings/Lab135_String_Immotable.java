package ex_14_Strings;

public class Lab135_String_Immotable {
    public static void main(String[] args) {

        String name = "Pramod";  // stored in string pool constant, as "Pramod"
        name = name.toUpperCase(); //  PRAMOD
        System.out.println(name); // but here only stored "pramod" not "PRAMOD"

        //  bcoz,  we  didn't assigned different variable to print upper case "PRAMOD"
        // for assigning, String name2 = name.toUpperCase();

     // So we have 2 string stored in "String Pool Constant".


    }
}
