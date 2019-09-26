/*
 * 
 * @Abraham 
 * @Description A guessing game
 * @Created 9/26/19
 * 
 */
import java.util.Scanner;
import java.util.Random;
public class GuessGame {
	
	static Scanner in = new Scanner(System.in);
	static Random rand = new Random();
	
	public static void main(String[] args) //main method
	{
		
		//Introduce the program 
		System.out.println("Welcome to Guessing 3000");
		String answer = in.next();
		
		while(answer.equalsIgnoreCase("yes")) {
		System.out.println("Enter a number from 1-10:");
		int userNumber = in.nextInt();
		int pcNumber   = rand.nextInt(10) + 1;
		if( userNumber == pcNumber) {
			System.out.println("You Won!");
		}else {
			System.out.println("You lost!");
			System.out.println("The Pc chose "+pcNumber);
		}
		System.out.println("Would you like to play again?");
		answer = in.next();
	}
		System.out.println("OK dear, Come back soon!");
	}

}
