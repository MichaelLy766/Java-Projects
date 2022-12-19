// 
//  Name:   Ly, Michael 
//  Project:  2
//  Due:        10/5/22 
//  Course:  cs-1400-03-f22 
// 
//  Description: 
//    Number guessing game that generates a random number from 1-100, allow user guesses, counts guesses, and tells user
//    if guess is high or low. 0 is used as a sentinel to quit. Program displays the number of guesses 
//    it takes to guess the right number if the user if the user guesses sucessfully.
// 

import java.util.Random;
import java.util.Scanner;

public class GuessingGame
{
    public static void main(String[] args) 
    {
        //generate a secret number between 1 and 100 
        Random rand = new Random();  
        if (args.length > 0)
        {
            rand.setSeed(Long.valueOf(args[0]));
        }
        int secretNumber = rand.nextInt(100) + 1; 

        //initialize guess counter to 1 
        int guessCounter = 1; 

        //program I/O and prompting user for input 
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Guess My Number Game by M. Ly");
        System.out.println();
        System.out.println("A secret number between 1-100 has been generated...");
        System.out.println("Enter guess 0 to quit.");
        System.out.println();
        System.out.print("Enter your guess? ");

        int userGuess = keyboard.nextInt();

        //if statements for all 5 scenarios 
        while (userGuess != secretNumber && userGuess != 0)
        {
            if (userGuess < secretNumber)
            {
                System.out.println("Guess is low, try again.");
            }
            else
            {
                System.out.println("Guess is high, try again.");
            }
            guessCounter++;
            System.out.print("Enter your guess? ");
            userGuess = keyboard.nextInt();
        }
        if (userGuess == secretNumber)
        {
            if (guessCounter == 1)
            {
                System.out.println();
                System.out.println("Congratulations, you got it in 1 guess!");
            }
            else
            {
                System.out.println();
                System.out.println("Correct in " + guessCounter + " guesses.");
            }
        }
        else
        {
            System.out.println();
            System.out.println("The secret number is " + secretNumber + "."); 
        }
    }
}