
public class Accumulator {
	private String value; 
	
	public Accumulator() {
		value = "0";
		display();
	}
	
	public void storeThisValue( String value ) {
		this.value = value;
	}
	
	//dafuq
	public void transferYourValue() {
		
	}
	
	public boolean receiveValue( String s ) {
		if(isInteger(s)) {
			appendToString(s);
			return true;
		} else if(s.charAt(0) == '.') {
			
		}
		return false;
	}
	
	
	
	public void appendToString( String  s ) {
		value += s;	
	}
	
	public void display() {
		System.out.println(value);
	}
	
	// derp
	
	public boolean isInteger( String v ) {
		try {
			Integer.parseInt( v );
			return true;
		} catch( Exception e ) {
			return false;
		}
	}
}