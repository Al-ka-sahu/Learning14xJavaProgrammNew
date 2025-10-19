package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {

    public static void main(String[] args) {

    String First_name = "Promod";
    String Last_Name = " Dutta";


    int a = 10;
    int b = 10;

        System.out.println(First_name+Last_Name+a+b);
        System.out.println(a+b+First_name+Last_Name);
        // BODMAS Rule : Bracket of division, mul, add, Sub
        System.out.println(First_name+Last_Name+(a+b));



    }
}
