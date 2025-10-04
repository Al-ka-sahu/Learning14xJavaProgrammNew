package ex_02_Java_Basics;

public class Lab024_printF {
    public static void main(String[] args) {
     int a = 10;
     int b = 20;

//        System.out.println(a);
//        System.out.println(b);


//        System.out.print(a);
//        System.out.print(b);

        System.out.printf("value of a=%d",a);
        System.out.println();
        System.out.printf("value of b=%d",b);
        // to replace the value of a into %d

         //%d -> int, byte, short, lon
        //%s -> String
        //%f -> float, double,
        //%b -> boolean

        System.out.println();
       // question * print the table of 9 via printf command not the loop concept.
         int table = 9;
        System.out.printf("%d*1=%d", table, table*1);
        // 1st table replace into 1st %d
        //2nd table*1 is replace into 2nd %d

    }
}
