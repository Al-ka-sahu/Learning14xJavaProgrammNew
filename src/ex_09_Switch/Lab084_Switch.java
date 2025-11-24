package ex_09_Switch;

import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {
       //you need to take user input and ask for the integer from 1 to 7.
        // And if user enters 1 to 7,
        // you will tell which day it is.
        //logic building formula

        /*
        * Step1 -Number one using the Scanner class.
        * Step2- number two fiquiring out the expression and the day.
        * Step3- We will Basically add step 3 as rough logic.
        * Step4 - 4 is you will write the fix logic and optimize.
        * Step5 - fiqure out the edge cases.
         */

       //Step1

       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day to 1 to 7");
        // we have another scanner function Scanner.hasNextInt(), it returns true & false.
        if (scanner.hasNextInt()){   // (check int is true or false the go to next steps.
            int day = scanner.nextInt();  // Store the int value.

            switch (day){
                case 1 :
                    System.out.println("Mon");
                break;   // break is used for exit the statement with end "}" curli braces,exit the loop

                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("wed");
                    break;
                case 4:
                    System.out.println("Thur");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:

                    System.out.println("sat");
                    break;
                case 7:
                    System.out.println("sun");
                    break;
                default:
                    System.out.println("Enter int number from 1 to 7 only, you fool!");
                    break;
            }

        }else {
            System.out.println("Enter int you FOOL!");
        }

    }
}
