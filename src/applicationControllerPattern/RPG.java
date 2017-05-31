package applicationControllerPattern;

public class RPG implements GenreChoice {


	@Override
	public void execute(String choice) {
		String rpgDesc = "is a video game genre where the player controls the actions of a character" + "/n" + " (and/or several party members) immersed in some well-defined world.";
		
		System.out.println(rpgDesc);
		
	}

}
