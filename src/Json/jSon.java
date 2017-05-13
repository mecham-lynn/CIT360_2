package Json;
import org.json.simple.*;

public class jSon {

	public static void main(String[] args){
			
		System.out.println(test());
		System.out.println(grabber());
	}
	public static JSONObject test(){
JSONObject jsontest = new JSONObject();
		
		jsontest.put("title:", "Eye of the World");
		jsontest.put("pages:", new Integer (643));
		jsontest.put("genre:", "High Fantasy");
		jsontest.put("Cost", new Double (35.95));
		jsontest.put("is_available", new Boolean(false));
		
		jsontest.remove("pages:");
		
		return jsontest;
	}
	
	public static JSONArray grabber(){
		JSONArray booklist = new JSONArray();
		
		booklist.add("Pawn of Prophecy");
		booklist.add("Queen of Sorcery");
		booklist.add("Magician's Gambit");
		booklist.add("Enchanter's Endgame");
		booklist.add("Seeress of Kell");
		
		booklist.remove(3);
		return booklist;
		
    }
}	