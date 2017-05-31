package applicationControllerPattern;

public class MMORPG implements GenreChoice {


	@Override
	public void execute(String choice) {
		String mmoDesc = "a combination of role-playing video games and" + "\n" + "massively multiplayer online games in which a very large number of players interact with one " + "\n" + "another within a virtual world.";
		
		System.out.println(mmoDesc);
		
	}

}
