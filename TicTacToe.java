/*
  class TicTacToe
  
  Taher Haji
  4/30/2022
  AP Computer Science A
  
  Summary of File: This file creates tic tac toe board
*/
import java.util.Scanner;
public class TicTacToe
{
   public static void main(String [] args)
   {
      Scanner kb = new Scanner(System.in);
      //variables
      boolean over = false; //just to keep game running until break
      int row;
      int column;
      //create players
      System.out.println("Who will be playing this game? (Player 1 is always X.)");
      System.out.println("Player 1:");
      String player1 = kb.next();
      System.out.println("Player 2:");
      String player2 = kb.next();
      //create game grid
      GameGrid tic = new GameGrid();
      while(!over)
      {
         //player one
         System.out.println(player1+" it is your turn\nEnter the row then column of where you would like to play:");
         row = kb.nextInt();
         column = kb.nextInt();
         //check to see if valid
         while(!tic.validPlay(row,column))
         {
            System.out.println("That is not a valid play.\nEnter the row and column again:");
            row=kb.nextInt();
            column = kb.nextInt();
         }
         //play game
         tic.play(true,row,column);
         //print grid
         System.out.println(tic);
         //check to see if tie
         if(tic.draw())
         {
            System.out.println("It's a draw!");
            break;
         }
         //check to see if player one has won
         if(tic.winner())
         {
            System.out.println(player1+" is the winner!");
            break;
         }
         //player two
         System.out.println(player2+" it is your turn\nEnter the row then column of where you would like to play:");
         row = kb.nextInt();
         column = kb.nextInt();
         //check to see if valid
         while(!tic.validPlay(row,column))
         {
            System.out.println("That is not a valid play.\nEnter the row and column again:");
            row=kb.nextInt();
            column = kb.nextInt();
         }
         //play game
         tic.play(false,row,column);
         //print grid
         System.out.println(tic);
         //check to see if tie
         if(tic.draw())
         {
            System.out.println("It's a draw!");
            break;
         }
         //check to see if player two has won
         if(tic.winner())
         {
            System.out.println(player2+" is the winner!");
            break;
         }

      }
      kb.close();
   }
}