package SnakeAndLadder;

import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static  void main(String [] args){

      boolean isMore =true;
      while(isMore){
          System.out.println("Welcome in Snake Ladder Game");
          Game obj = new Game();
          obj.startGame();
          System.out.println("Do you want to play again ?");
          Scanner sc = new Scanner(System.in);
          String ans = sc.next();
          if(ans.toLowerCase(Locale.ROOT).equals("no")){
              isMore=false;
          }
      }

  }
}

