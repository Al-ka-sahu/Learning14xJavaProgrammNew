package ex_08_If_Condition;

public class Lab079_If {

    public static void main(String[] args) {

        String user_input = args[0];
        System.out.println(user_input);
//        now convert the string into int by using Integer.parseInt
        int age = Integer.parseInt(user_input);

        // value will be save in age as integer form, as checcking via debugging points user input
        // is showing in inverted comma as string which has converted into int.

        if (age > 18) {  // condition = True
            System.out.println("Yes you can vote");
        }

       else {
          System.out.println("You can't vote");
        }

    }
}
