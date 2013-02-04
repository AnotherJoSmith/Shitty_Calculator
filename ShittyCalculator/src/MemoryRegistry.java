public class MemoryRegistry {
	private double mem;

	public MemoryRegistry() {
		mem = 0;
	}

	/*
	 * If put in memory is called, CU calls this function.
	 * CU should verify that accumulator is holding a number and not message
	 */
	public void storeThisValue(String value) {
		mem = Double.parseDouble(value);
	}

	// fancy getter lol
	public double transferYourValue() {
		return mem;
	}

	// Should be called by clear() in CU
	public void reset() {
		mem = 0;
	}

}