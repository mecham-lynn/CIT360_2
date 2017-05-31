package applicationControllerPattern;

import java.util.Scanner;
import java.io.IOException;


public class Application {
	
	public static void main(String[] args){
		try{
			
		genreController gameGenres = new genreController();
		
		
		String choice;
		
		Scanner speak = new Scanner(System.in);
		
		System.out.println("What Game Genre would you like to explore? ");
		System.out.println("First Person Shooter,\nRole-Playing Game,\nMassive Multiplayer Online Role-Playing Game,\nAction Role-Playing Game,\nReal Time Strategy");
		
		choice = speak.nextLine();
		
		System.out.println("You chose: " + choice);
		gameGenres.genreHandler(choice);
		
	}
		catch (Exception f){
			
		
			genreController gameGenres = new genreController();
			Scanner speak = new Scanner(System.in);
			
			System.out.println("Your Choice does not match available options, please select again: ");
			String choice = speak.nextLine();
			
			gameGenres.genreHandler(choice);
		}
		
	}
	
}
