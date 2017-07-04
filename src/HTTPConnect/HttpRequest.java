package HTTPConnect;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequest {
    public static void main(String[] args) throws Exception {
        
        HttpRequest MemeRequest = new HttpRequest();        
        
        MemeRequest.getInformation();
    }
    
    private void getInformation() throws Exception {
        
        String NyanCat = "http://www.nyan.cat/";
              
        URL location = new URL(NyanCat);
        
        
        HttpURLConnection MEME = (HttpURLConnection) location.openConnection();
        
        int getServerResponse = MEME.getResponseCode();
        


        BufferedReader ResponseGatherer = new BufferedReader (
                new InputStreamReader(MEME.getInputStream()));
        
        // Displaying output as a string (HTML CODE)
        
        String reaction;
        StringBuffer gasp = new StringBuffer();
        
        while ((reaction = ResponseGatherer.readLine()) !=null) {
        	gasp.append(reaction);
        }
        ResponseGatherer.close();
        System.out.println(gasp.toString());
        System.out.println("\n"+ "this is the response code: "+ getServerResponse);
    } 
}