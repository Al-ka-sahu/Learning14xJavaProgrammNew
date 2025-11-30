package ex_13_Functions;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {

//       User Defined Functions.

//        1. Without Parameter and without Return Type
//        2. Without Parameter but with Return Type
//        3. With Parameter and without Return Type
//        4. With Parameter and With Return Type

// JVM is running within main method.
// that's why all USER defined function is called within main method.
//but function always defined outside the main method


       //1. Without Parameter and without Return Type
        wop_wor_greet();

       //2.  Without Parameter but with Return Type
        String message =wop_wr_greet();
        System.out.println(message);

       //3. With Parameter and without Return Type (90%times you will be used)
        greet_with_details("Alka", 34, 8000.88);
        greet_with_details( "Pramod", 34, 80.88);

        //4. With Parameter and With Return Type
        int sum =sum_of_two_numbers(23, 45);
        int sum1 = sum_of_two_numbers(11,  12);
        int sum2 =sum_of_three_numbers(23, 45,78);
        float sum3 = sum_of_three_number_float(34.34f, 45.1f, 12.12f);

        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);



    }

    // 1.Without Parameter and without Return Type
       static void wop_wor_greet(){
           System.out.println("Hi,type 1 function");

       }
     //2.Without Parameter but with return type
    static String wop_wr_greet(){
        System.out.println("Hi,type 2 function");
        return "Hi, how are you";
    }
    //3. With Parameter and without Return Type (90%times you will be used)
     static void greet_with_details(String name, int age, double salary){
         System.out.println("Your name is ->" + name +  "\n Your age" + age +  "\n Your salary is" + salary +"\n");
     }
     //4. With Parameter and With Return Type

    static int sum_of_two_numbers(int a, int b ){
        return a+b;
    }
    static int sum_of_three_numbers(int a, int b, int c){
        return a+b+c;
    }
    static float sum_of_three_number_float(float a, float b, float c){
        return a+b+c;
    }


}
