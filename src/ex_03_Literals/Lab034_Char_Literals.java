package ex_03_Literals;

public class Lab034_Char_Literals {

    public static void main(String[] args) {
        char c1 = 'A';
// charactor Literals is any things A-Z, a-z and specials elements!@#$%^&*()_+
       // char c = "A"; // "" == String = Bunch of char
     char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space is also charactor

       //Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("PromodDutta");
        System.out.println("Promod"+new_line+"Dutta");
        System.out.println("Promod\nDutta");
        System.out.println("Promod"+tab_line+"Dutta");
        System.out.println("Promod\tDutta");
        System.out.println("Promod\bDutta");
        System.out.println("Promod\rDutta");
        System.out.println("Hi, this is the first line"+new_line+"this is second line\n");








    }
}
