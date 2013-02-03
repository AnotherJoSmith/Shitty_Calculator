public class Accumulator {
	private String value; 

	public Accumulator() {
		value = "0";
		display();
	}

	public void storeThisValue(String value) {
		this.value = value;
	}

	public void transferYourValue() {
	}

	public boolean receiveValue(String s) {
		// Check if value length is under 11
		if(value.length() < 11) {
			if(isInteger(s)) {
				appendToString(s);
			} else if(s.charAt(0) == '.') {
				appendToString(s);
			} else {
				storeThisValue(s);
			}

			display();
			return true;
		} else {
			storeThisValue("ERROR");
			display();
			return false;
		}
	}



	public void appendToString(String  s) {
		if(value.equals("0")) {
			value = s;
		}

		value += s;	
	}

	// Sould be called on clear() in CU
	public void reset() {
		value = "0";
	}

	public void display() {
		System.out.println(value);
	}

	public boolean isInteger(String v) {
		try {
			Integer.parseInt(v);
			return true;
		} catch(Exception e) {
			return false;
		}
	}

}
