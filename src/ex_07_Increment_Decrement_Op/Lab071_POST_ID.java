package ex_07_Increment_Decrement_Op;

public class Lab071_POST_ID {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++);

//        1st increase the value of a (a+1= 11) then store the value

//        POST increment = Print 1st then increase.
        int a_post = 10;
        int b = a_post++;
        System.out.println(a_post); // here a_post value will be assigned into b then increment +1
        System.out.println(b);

//        ERT (Exp and Result Table)
//         line | a_post | b
//         11  | 10  | NA
//         12  | 11  | 10
//         13  |  11 - Print | 10
//          14 | 11 | 10 - Print


        // in POST ID,  1st assigned the value  in b then increment the value.


    }
}
