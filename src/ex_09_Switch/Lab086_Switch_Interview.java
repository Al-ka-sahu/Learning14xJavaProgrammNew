package ex_09_Switch;

import java.util.Scanner;

public class Lab086_Switch_Interview {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day num (1 to 7)");
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
        }


    }
}
// if we enter more than 7 value then nothing will print bcoz not metioned in else condition
