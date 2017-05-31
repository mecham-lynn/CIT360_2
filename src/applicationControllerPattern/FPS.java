package applicationControllerPattern;

public class FPS implements GenreChoice {
	


	@Override
	public void execute(String choice) {
		
		String fpsDesc = "a video game genre centered around gun"+"\n"+"and other weapon-based combat in a first-person perspective;";
		
		System.out.println(fpsDesc);
		
	}

}
