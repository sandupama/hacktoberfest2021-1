package rock_paper_scissor;

import java.util.Random;
import java.util.Scanner;
/** * @author Sandupama* Assessment 2  algorithm  */
public class Rock_Paper_Scissor {
    
          /** Rock Paper Scissors game*/
    
    final static String  ROCK = "1",  PAPER = "2",SCISSORS = "3" ;
    
    public static void main(String[] args) {
       System.out.println("Enter Rock, Paper, or Scissors:  ");
      System.out.println("ROCK 1");
      System.out.println("PAPER 2");
      System.out.println("SCISSORS 3");
      System.out.println();   
      String playerChoice = getPlayer();
      String computerChoice = getComputerChoice();
      /*playerMove = computerMove */
            
      if (playerChoice.equals(computerChoice))
            System.out.println("Game is Draw");
      // Player choice= 1        
      else if (playerChoice.equals(Rock_Paper_Scissor.ROCK))
        System.out.println(computerChoice.equals(Rock_Paper_Scissor.PAPER) ? "Computer Wins": "Player wins");   
      //  player choice=2
      else if (playerChoice.equals(Rock_Paper_Scissor.PAPER))
        System.out.println(computerChoice.equals(Rock_Paper_Scissor.SCISSORS) ? "Computer Wins": "Player wins");   
      // player choice=3   
      else
        System.out.println(computerChoice.equals(Rock_Paper_Scissor.ROCK) ? "Computer Wins": "Player wins");   
    }
    
    /* Computer's choice  using Random  class nextInt() method */   
    public static String getComputerChoice()
    {
        String computerchoice;
        Random random = new Random();
        int input = random.nextInt(3)+1;
        if (input == 1)
            computerchoice = Rock_Paper_Scissor.ROCK;
        else if(input == 2)
            computerchoice = Rock_Paper_Scissor.PAPER;
        else
            computerchoice = Rock_Paper_Scissor.SCISSORS;
            
        System.out.println("Computer Choice is: " + computerchoice);
        System.out.println();
        return computerchoice;    
    }
    
    public static String getPlayer()
    {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String  playerchoice = input.toUpperCase();
        System.out.println("Player Choice is: "+  playerchoice);
        return  playerchoice;
    }       
}
