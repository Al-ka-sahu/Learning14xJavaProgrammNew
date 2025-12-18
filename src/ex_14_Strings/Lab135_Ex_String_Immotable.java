package ex_14_Strings;

public class Lab135_Ex_String_Immotable {
    public static void main(String[] args) {
        String name = "Pramod";
       String name1= name.toUpperCase(); // PRAMOD
       // System.out.println(name);  // now we have assigned the variable  to call the upper case "PRAMOD"
        System.out.println(name1);// if we don't assigned then it will be call only "pramod"
        // here both Strings are immotable, they can't change the values.


    }
}
