
public class MemoryRegistry {
	private double mem;

	public MemoryRegistry() {
		mem = 0;
	}

	public void storeThisValue(String value) {
		mem = Double.parseDouble(value);
	}

	public void transferYourValue() {


	}

}
