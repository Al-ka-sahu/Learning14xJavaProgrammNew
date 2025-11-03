package ex_06_Ternary_Operators;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {

      //  String Up1 = args[0]; //12
//        String Up2 = args[1]; //14
//        String Up3 = args [2]; //16

//        System.out.println(Up1);
//        System.out.println(Up2);
//        System.out.println(Up3);

        String user_input = args[0]; // age = 68
        System.out.println(user_input);
        System.out.println(user_input instanceof String);

        // user_input is the instance of String

        // Input ->> String
        // String --> Int

        int age = Integer.parseInt(user_input);

        String result = age < 18 ? "Minor" : age <= 60 ? "Adult" : "Sr. Citizen";
        System.out.println(result);











    }
}
