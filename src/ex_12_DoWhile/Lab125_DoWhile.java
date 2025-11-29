package ex_12_DoWhile;

public class Lab125_DoWhile {
   public static void main(String[] args) {
        // "Do while" run at-least one time.

        int a = 1;
        do {
            System.out.println("Body!");
            System.out.println(a);
            a++;

        }while (a<10);  // after print the value, do while check the condition then updation via a++

    }
}
