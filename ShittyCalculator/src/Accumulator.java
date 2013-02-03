public class Accumulator {
	private String value; 

	public Accumulator() {
		value = "0";
		display();
	}

	public void storeThisValue(String value) {
		this.value = value;
	}

	//dafuq
	public void transferYourValue() {
		//lkl
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

	public void display() {
		System.out.println(value);
	}

	// derp

	public boolean isInteger(String v) {
		try {
			Integer.parseInt(v);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Accumulator ac = new Accumulator();
		
		ac.receiveValue("4");
		ac.receiveValue("4");
		ac.receiveValue("4");
		ac.receiveValue("4");
		ac.receiveValue(".");
		ac.receiveValue("2");
		ac.receiveValue("2");
		ac.receiveValue("ENTERMONEY");
	}

	}
