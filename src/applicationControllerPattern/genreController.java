package applicationControllerPattern;

import java.util.HashMap;

public class genreController {

	public static HashMap<String, GenreChoice> genres = new HashMap<String, GenreChoice>();
	
	
	public void genreHandler(String choice){
		
		genres.put("First Person Shooter", new FPS());
		genres.put("Role-Playing Game", new RPG());
		genres.put("Massive Multiplayer Online Role-Playing Game", new MMORPG());
		genres.put("Action Role-Playing Game", new ARPG());
		genres.put("Real Time Strategy", new RTS());
		
		GenreChoice handler = genres.get(choice);
		
		handler.execute(choice);
	}
}
