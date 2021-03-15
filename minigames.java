/* 
Desctiption: One of my first projects in java, 
a fun minigame menu that allows you to play four minigames!
Written By: avslav
Date: 15/03/2021 
*/
package Projects.Minigames;

import java.util.Random;
import java.util.Scanner;

public class minigames extends _8ball  {
    
    // Flip Coin Method
    public static void coinFlip(){
            
        Random side = new Random();
        int result = side.nextInt(2);

        if (result == 1){
            System.out.println("You got heads!");
                }
        else {
            System.out.println("You got tails!");
                }

    }
    
    // Dice Roll Method
    public static void diceroll() {
        Random num = new Random();
        int x = num.nextInt(6);
        System.out.println("\nNumber Rolled: " + x);
    }

    // Number Guess Method
    public static void guess() {

        Random num = new Random();
        int x = num.nextInt(10);
        
        System.out.println("\nType a number from 1 to 10!\n");
        Scanner input = new Scanner(System.in);
        int y = input.nextInt();

        if (x == y) {
            System.out.println("\nCorrect! You got the number right!\n");
        }
        else {
            System.out.println("\nIncorrect! The number was: " + x);
        }
    }

   
    // Option Menu Method
    public static void optmenu() {
        int opt = 0;
        Scanner choice = new Scanner(System.in);
        
        System.out.println("What minigame would you like to play?");
        System.out.println("\n1. Dice\n2. 8ball\n3. Coinflip\n4. Number Guessing Game");

        int x = choice.nextInt();
       

        switch (x) {
            case 1:             // If the input is 1, call the dice roll method
                diceroll();
                break;
            case 2:             // If input is 2, call an eightball cmd from a different file
                eball();
                break;
            case 3:             // If the input is 3, call a coinflip static method from above
                coinFlip();
                break;
            case 4:             // If the input is 3, call a coinflip static method from above
                guess();
                break;
            default:            // If another input is provided, return a default string
                System.out.println("\nInvalid input! Please provide a number from 1-4!\n");
                break;
                    }
        choice.close();
        

            
  
    }
    public static void main(String[] args) { // By default, it will call the option menu once you execite the code
        optmenu();
       }
}
