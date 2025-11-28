package ex_10_For_Loop;

public class Lab0110_Odd_Even_From_Top50_Interview {
    public static void main(String[] args) {
        // To find the even number from 1 to 50
        // ask this questions in wingify

        for (int i = 1; i <= 50; i++){
            if (i % 2 == 0){
                System.out.println("Even ->" +i);
            }

        }
//    To find the ODD number from 1 to 50

       for (int i = 1; i <=50 ; i++){
           if (i % 2 !=0){
               System.out.println("ODD ->" +i);
           }
       }

    }
}
