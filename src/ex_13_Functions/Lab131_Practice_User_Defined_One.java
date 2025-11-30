package ex_13_Functions;

import java.util.Scanner;

public class Lab131_Practice_User_Defined_One {
    public static void main(String[] args) {
        //also i can take the input from scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the a");
        int a = scanner.nextInt();
        System.out.println("enter the b");
        int b = scanner.nextInt();

        int result = old_sum_of_two_number(a,b);




        int old_result = old_sum_of_two_number(7, 8);
        System.out.println(old_result);

        old_sum_of_two_number();


    }

    static int old_sum_of_two_number(int a, int b) {
        return a + b;

    }

    static void old_sum_of_two_number() {
        System.out.println("hi, there");
    }

    // static int old_sum_of_two_number(){
    //   return 18+19;  // can't use same function for hardcoded value


}

