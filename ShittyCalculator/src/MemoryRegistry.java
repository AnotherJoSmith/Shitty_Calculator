public class MemoryRegistry {
	private double mem;

	public MemoryRegistry() {
		mem = 0;
	}

	public double getMem() {
		return mem;
	}

	/*
	 * If put in memory is called, CU calls this function.
	 * CU should verify that accumulator is holding a number and not message
	 */
	public void storeThisValue(String value) {
		mem = Double.parseDouble(value);
	}

	/*
	 * If take from memory is called, CU calls this function 
	 * passing through the AC in parameter
	 */
	public void transferYourValue(Accumulator ac) {
		ac.storeThisValue(Double.toString(mem));
	}

	// Should be called by clear() in CU
	public void reset() {
		mem = 0;
	}

}