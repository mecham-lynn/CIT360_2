package modelViewControl;

import java.awt.event.*;


public class Control {
	
	private View theView;
	private Model theModel;
	
	public Control(View theView, Model theModel){
		
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addCalculateListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			
			try{
				
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				
				theModel.addTwoNumbers(firstNumber, secondNumber);
				
				theView.setCalcSolution(theModel.getCalculationValue());
			}
			catch(NumberFormatException ex){
				
				theView.displayErrorMessage("You need to enter 2 numbers");
				
			}
			
		}
		
	}
//	
//	private int calculationValue;
//	
//	public void addTwoNumbers( int firstNumber, int secondNumber){
//		
//		calculationValue = firstNumber + secondNumber;
//	}
//	
//	public int getCalculationValue(){
//		
//		return calculationValue;
//		
//	}
}
