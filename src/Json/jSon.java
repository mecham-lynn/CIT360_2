package Json;
import org.json.simple.*;
import org.json.simple.parser.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class jSon {

	public static void main(String[] args){
			
		System.out.println(test());
		System.out.println(grabber());
		JSONWriter(test(),grabber());
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
	public static void JSONWriter(JSONObject singleBook, JSONArray booklist){
		
		singleBook.put("OtherBooks:", booklist);
		try(
				FileWriter file = new FileWriter("C:\\Users\\Lynn\\workspace\\CIT360test\\src\\Json\\test.json")
				){
			file.write(singleBook.toJSONString());			
			file.close();
			
		} catch (IOException IOException){
			IOException.printStackTrace();
		}
		
	}
}	