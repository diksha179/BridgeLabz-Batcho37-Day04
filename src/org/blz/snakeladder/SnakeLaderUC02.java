package org.blz.snakeladder;
import java.util.Scanner;

//Rule1 -> Snake and Ladder game played at player position 0
//Rule2 -> The player roll the die and get the number between 1 to 6

public class SnakeLaderUC02{
	 static void rolldie() {
		  int min=1;
		  int max=6;
		  int Number= (int) Math.floor(Math.random()*(max-min)+min);
		
		  System.out.println("Die = "+Number);
	    }

	public static void main(String[] args) {

	   int position=0;
	   Scanner sc=new Scanner(System.in);

	   System.out.println("Enter how many players want to play");
	   int player = sc.nextInt();
	    System.out.println("Player in the position = "+position);
	   rolldie();
	   sc.close();
	  }
  }
		