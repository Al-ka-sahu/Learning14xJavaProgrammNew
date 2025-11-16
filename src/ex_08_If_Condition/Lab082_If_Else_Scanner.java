package ex_08_If_Condition;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Lab082_If_Else_Scanner {
    public static void main(String[] args) {
        // allowed to vote or not - age
       // If age> 18 -> allowed to vote.
       //else  age < > 18 -> Not allowed to vote

       // How to take the user Input
       // 1. CLI Options
       //

       // Int age = Integer.parseInt(args[0]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println(age);



    }

}
