package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ_Interview_Factorial {
    public static void main(String[] args) {
        //Factorial Programm in while
        /*
        * The Logic building formula we are discussing.
        * Step number one, you have to figure out what is the data type for input and output
        * Step number two, write a rough logic around this.
        * Step number three, write a proper logic around this.
        * Step number four, optimize.
        * Step number five, which is edge cases
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for factorial");
        if (!scanner.hasNextInt()) { //  edge-cases handled
            System.out.println("You Fool, int only!");
        }
        else{
             int number = scanner.nextInt();
             int fact = 1;
             if (number ==0){  // Edgecases
                 fact =1;
                 System.out.println("fact = 1");

             }
            if(number < 0 || number > Integer.MAX_VALUE){ // edgecases
                System.out.println("Can't get the Factorial as out of bound!(int)");
            }
            int i = 1;
            while (i<= number){  // final condition applied after entering the positive value.
                fact = fact*i;
                i++;

            }
            System.out.println(fact);
        }

    }
}
