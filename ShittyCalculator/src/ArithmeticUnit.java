public class ArithmeticUnit {
	private double result;
	private char operation; // Operation is stored in AU
	
	public ArithmeticUnit() {
		result = 0;
	}
	
	public double executeOperation(String value) {
		double operand = Double.parseDouble(value);
		
		if(operation == 'A') {
			result += operand;
		} else if (operation == 'M') {
			result *= operand;	
		} else {
			System.out.println("ERROR! Cleared.");
			result = 0;
		}
		
		return result;
	}


	/*
	 * Used if we want to override the content of the AU 
	 * (when the first number in an operation is entered)
	 */
	public void storeThisValue(String value) {
		result = Double.parseDouble(value);
	}
	
	
	public void storeOperation(char op) {
		operation = op;
	}
	 
	// Used as getter for value
	public double transferYourValue() {
		return result;
	}

	// Should be called on clear() in CU
	public void reset() {
		result = 0;
	}
}