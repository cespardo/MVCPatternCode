

//The Model performs all the calculations needed
// and that is it. It doesn't know the View
// exists

public class CalculatorModel {
	
	private int calculationValue;

		public void addTwoNumbers(int firstNumber, int secondNumber){
	
		calculationValue = firstNumber + secondNumber;
	}
	    public int getCalculationValue(){
	
        return calculationValue;
	 }
}


