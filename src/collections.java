import java.util.*;

public class collections {

	public static void main(String[] args){
		
		System.out.println(gameList());
		System.out.println(gameGenreList());
		System.out.println(Library());
		hashTest();
		BooksInLibrary();
	
	}
	public static List<String> gameList(){
		List <String> game = new ArrayList<String>();
		
		game.add("Halo");
		game.add("Halo 2");
		game.add("Skyrim");
		game.add("Halo 4");
		game.add("Resident Evil");
		game.add("Fallout 4");
		game.add("Halo Wars");
		game.add("Halo Wars 2");
		game.add("Call of Duty");
		game.add("Medal of Honor");
		
		game.remove(4);
		
		return game;
	}
	
	public static List<String> gameGenreList(){
		
		LinkedList <String> gameGenre = new LinkedList<String>();
		
		gameGenre.add("First Person Shooter");
		gameGenre.add("Role Playing Game");
		gameGenre.add("Horror");
		
		String fps = gameGenre.get(0) + " = Halo";
		String rpg = gameGenre.get(1) + " = Skyrim";
		String horror = gameGenre.get(2) + " = Resident Evil";
		
		gameGenre.set(0, fps);
		gameGenre.set(1, rpg);
		gameGenre.set(2, horror);
		
		gameGenre.remove(1);
		
		return gameGenre;
		
	}
	
	public static Map<String, String> Library(){
		Map<String, String> Library = new HashMap<String, String>();
		
		Library.put("Fantasy", "Words Of Radiance");
		Library.put("Science Fiction", "Leviathan Awakens");
		Library.put("Fiction", "A Time to Kill");
		
		Library.remove("Fiction");
		
		return Library;
	}
	
	public static Set<String> hashTest(){
		
		Set<String> iceCream = new HashSet<String>();
		iceCream.add("Chocolate");
		iceCream.add("Vanilla");
		iceCream.add("Peanut Butter");
		iceCream.add("Mint");
		//the duplicate will be removed.
		iceCream.add("Chocolate");
		
		System.out.println(iceCream);
		
		System.out.println("Who likes mint???? Not Me!");
		
		iceCream.remove("Mint");
		
		System.out.println(iceCream);
		
		return iceCream;
	}
	public static void BooksInLibrary(){
		//Book treeSet
		TreeSet<String> books = new TreeSet<String>();
		//Books
		books.add("Mistborn: The Final Empire");
		books.add("Mistborn: The Well of Ascension");
		books.add("Mistborn: The Hero of Ages");
		books.add("Way of Kings");
		books.add("Words of Radiance");
		books.add("The Rithmatist");
		
		Iterator<String> bookIterator = books.iterator();
		while(bookIterator.hasNext()){
			System.out.println(bookIterator.next() + "\n");
		}
	}
}