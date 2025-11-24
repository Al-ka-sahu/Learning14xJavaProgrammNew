package ex_09_Switch;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Lab085_Switch_Without_Break {
  public static void main(String[] args) {
        // if we do not use break then it will not break the cases, and directly print the all details.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the day num (1 to 7)");
        int day = scanner.nextInt();

         switch (day){
             case 1 :
                 System.out.println("Mon");
             case 2 :
                 System.out.println("Tue");
             case 3 :
                 System.out.println("wed");
             case 4:
                 System.out.println("Thu");
             case 5:
                 System.out.println("fri");
             case 6:
                 System.out.println("sat");
             case 7:
                 System.out.println("sun");

//whatever number you will ask from user, it will be print accordingly

         }
    }


}
// o/p print like this:
/*
* Enter the day num (1 to 7)
1
Mon
Tue
wed
Thu
fri
sat
sun
*
*
*
* */