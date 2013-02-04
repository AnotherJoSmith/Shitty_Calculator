public class Accumulator {
	private String value; 
	private boolean hasPoint = false;

	public Accumulator() {
		value = "0";
		display();
	}


	public void storeThisValue(String value) {
		this.value = value;
	}

	public String transferYourValue() {
		return value;
	}

	public boolean receiveValue(String s) {
		// Check if value length is under 11
		if(value.length() < 11) {
			if(isInteger(s)) {
				appendToString(s);
			} else if(s.charAt(0) == '.' && !hasPoint) {
				appendToString(s);
				hasPoint = true;
			} else if(s.charAt(0) == '0' && hasPoint) {
				syntaxError();
			}

			display();
			return true;
		} else {
			syntaxError();
			return false;
		}
	}


	// Permits the accumulator to add either integers or .'s to the number
	public void appendToString(String  s) {
		if(value.equals("0")) {
			value = s;
		}
		value += s;	
	}

	private void syntaxError() {
		storeThisValue("Syntax Error");
	}

	// Sould be called on clear() in CU
	public void reset() {
		value = "0";
		hasPoint = false;
	}

	public void display() {
		System.out.println(value);
	}

	// Method verifying if a string passed is a number
	public boolean isInteger(String v) {
		try {
			Integer.parseInt(v);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
}
