package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game_Imp_Logic {
    public static void main(String[] args) {
         //Guess a number between 1 to 100
         //n = 56
        // 90, 60, 50 -> 50 to 60 yes
        // whenever you controlled the "entry"                                                                                                                                                                                                                                                                                                                               , you will use while loop not "For loop"

        Random random = new Random(); // to take a random number the yes Java's random class which has fuctio is nextInt
        int numberToGuess = random.nextInt(101); // 1 to 100 random will come
        System.out.println(numberToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts = 0;

        while (true){ // the condition will always true
           if (!scanner.hasNextInt()) {
               System.out.println("Invalid input! Please enter a number.");
               scanner.next();  // consume invalid token
               continue;
           }

           guess = scanner.nextInt();
           attempts++;

           if(guess < 1 || guess > 100){ // Edgecase handled
               System.out.println("Please enter a number between 1 and 100.");
               continue;
           }

           if (guess < numberToGuess){ //edge cases handled
               System.out.println("Too low, try again");
           } else if (guess > numberToGuess){
               System.out.println("Too high, try again");
           }
           else{
               System.out.println("Correct! You guessed it in " + attempts + "attempts");
               break; // to close the while loop we break
           }
        }


    }
}



