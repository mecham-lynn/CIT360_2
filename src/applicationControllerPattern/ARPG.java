package applicationControllerPattern;

public class ARPG implements GenreChoice {


	@Override
	public void execute(String choice) {
		String arpgDesc = " is a loosely-defined subgenre of role-playing video games" +"\n"+" which emphasize real-time combat whereby the player has direct control "+"\n"+" over characters, instead of turn-based or menu-based combat.";
		
		System.out.println(arpgDesc);
		
	}

}
