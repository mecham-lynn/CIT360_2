package applicationControllerPattern;

public class RTS implements GenreChoice {


	@Override
	public void execute(String choice) {
		String rtsDesc = " is a subgenre of strategy video games where the game does not progress" +"\n"+" incrementally in turns.";
		
		System.out.println(rtsDesc);
		
	}

}
