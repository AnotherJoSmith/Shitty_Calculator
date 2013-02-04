public class ArithmeticUnit{
	private double result;

	public ArithmeticUnit() {
		result = 0;
	}

	public double executeOperation(String op, String value) {
		double operand = Double.parseDouble(value);

		if(op.equals("A")) {
			result += operand;
		} else if(op.equals("M")) {
			result *= operand;
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

	/*
	 * Used to transfer the result from an operation to the AC
	 */

	public void transferYourValue(Accumulator ac) {
		ac.storeThisValue(Double.toString(result));
	}

	// Should be called on clear() in CU
	public void reset() {
		result = 0;
	}
}