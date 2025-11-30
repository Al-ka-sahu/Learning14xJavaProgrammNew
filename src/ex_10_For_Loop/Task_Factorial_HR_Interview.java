package ex_10_For_Loop;

import java.util.Scanner;

public class Task_Factorial_HR_Interview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scanner.nextInt();
        int fact = 1;
        if (n == 0) { // edge case handled o!= 1 (zero factorial =1)
            fact = 1;
        }

           for (int i = n; i >= 1;  i--){
        //for (int i = 1; i <=n; i++) {
            fact = fact * i;  // (1=1*1, 1=1*2, 2= 2*3, 6 = 6*4, 24= 24*5 = 120)
            //  }
            System.out.println(fact);
             // 5factorial = 5*4*3*2*1
        }
    }
}

