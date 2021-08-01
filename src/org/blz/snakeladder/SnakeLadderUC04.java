package org.blz.snakeladder;

//Rule1 -> Snake and Ladder game played at player position 0
//Rule2 -> The player roll the die and get the number between 1 to 6
//Rule3 -> Check option they are no play,Ladder or Snake
//Rule4 -> Repeat till the player reaches the winning position 10


public class SnakeLadderUC04 {

		static int total=0;
		static int cal=0;
		static int count=0;

		static void rolldie() {
			int min=1;
			int max=6;
			int dieNumber = (int) Math.floor(Math.random()*(max-min)+min);
		
			System.out.println("Die = "+dieNumber);
		

			if (total <= 100) {

				total=total+dieNumber; 

				System.out.println("Player in the position = "+total);
				switch (total) {
					case 10:
						System.out.println("Ladder");
						total=total+10;
						System.out.println("After Ladder = "+total);
						break;
					case 20:
						System.out.println("Snake");
						total=total-5;
						System.out.println("After Snake = "+total);
						break;
					case 30:
						System.out.println("Ladder");
						total=total+10;
						System.out.println("After Ladder = "+total);
						break;
					case 40:
						System.out.println("Snake");
						total=total-5;
						System.out.println("After Snake = "+total);
						break;
					case 50:
						System.out.println("Ladder");
						total=total+10;
						System.out.println("After Ladder = "+total);
						break;
					case 60:
						System.out.println("Snake");
						total=total-5;
						System.out.println("After Snake = "+total);
						break;
					case 70:
						System.out.println("Ladder");
						total=total+10;
						System.out.println("After Ladder = "+total);
						break;
					case 80:
						System.out.println("Snake");
						total=total-5;
						System.out.println("After Snake = "+total);
						break;
					case 90:
						System.out.println("Ladder");
						total=total+10;
						System.out.println("After Ladder = "+total);
						break;
					case 100:
						System.out.println("Exit"); 
						break;
				}
			}
			else {
				rolldie();
			}
		}

		static void checkPlayer(int check) {

			switch (check) {

				case 0:
					System.out.println("They are No play");
					break;
				case 1:
					rolldie();
					break;
				case 2:
					rolldie();
					break;
				default:
					System.out.println("Some thing went wrong");
			}
		}
		
	}
	
	


