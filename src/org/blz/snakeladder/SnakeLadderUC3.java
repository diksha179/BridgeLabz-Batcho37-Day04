package org.blz.snakeladder;

//Rule1 ->check They are no play, Ladder or Snake
//Rule2 -> The player roll the die and get the number between 1 to 6

public class SnakeLadderUC3 {

 public static void rolldie() {
	int min=1;
	int max=6;
	int dieNumber = (int) Math.floor(Math.random()*(max-min)+min);
	
	System.out.println("Die = "+dieNumber);
	}
	static void checkPlayer(int check) {

		
		switch (check) {
			case 0:
				System.out.println("They are No play");
				break;
			case 1:
				System.out.println("Ladder");
				rolldie();
				break;
			case 2:
				System.out.println("Snake");
				rolldie();
				break;
			default:
				System.out.println("Some thing went wrong");
		}
	}
	public static void main(String[] args) {

		int position=0;
        System.out.println("Player in the position = "+position);

		int check = (int) Math.floor((Math.random()*10) % 3 );

		checkPlayer(check);
	
	}
}
