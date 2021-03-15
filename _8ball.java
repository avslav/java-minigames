package Projects.Minigames;

import java.lang.Math;
import java.util.Scanner;

public class _8ball {

  static int num = (int)(Math.random() * 8);


  public static void eball() {
    Scanner input = new Scanner(System.in);

    System.out.println("What is your question?");
    final String question = input.nextLine();
    input.close();

    switch(num) {
      
      case 0:
      System.out.println("\nYes!\n");
      break;
      case 1:
      System.out.println("\nNo!\n");
      break;
      case 2:
      System.out.println("\nMaybe!\n");
      break;
      case 3:
      System.out.println("\nUnlikely!\n");
      break;
      case 4:
      System.out.println("\nCan't hear you.\n");
      break;
      case 5:
      System.out.println("\nConcentrate and ask again!\n");
      break;
      case 6:
      System.out.println("\nToo early to say!\n ");
      break;
      case 7:
      System.out.println("\nOk mate, no.\n");
      break;
      
      
    
    
    }
    
  }
  
  
  
  public static void main(String[] args) {

  eball();
  }
}