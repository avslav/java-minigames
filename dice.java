package Projects.Minigames;

import java.util.Random;

public class dice {
    
    public static void main(String[] args) {

        Random num = new Random();
        
        int x = num.nextInt(6);

       
        System.out.println("\nNumber Rolled: " + x);


    }
}
