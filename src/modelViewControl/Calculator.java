package modelViewControl;

public class Calculator {

	public static void main(String[] args){
		
		View theView = new View();
		
		Model theModel = new Model();
		
		Control theController = new Control(theView, theModel);
		
		theView.setVisible(true);
		}
}
