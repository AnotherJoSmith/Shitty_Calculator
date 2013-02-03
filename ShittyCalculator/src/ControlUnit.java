class ControlUnit{
	
	private static ControlUnit instance;
	private static Accumulator accumulator;
	private static MemoryRegistry memReg;
	private static ArithmeticUnit arithUnit;
	
	public ControlUnit getInstance(){
		if (instance == null) instance = new ControlUnit();
		return instance;
	}
	
	private ControlUnit(){
		accumulator = new Accumulator();
		memReg = new MemoryRegistry();
		arithUnit = new ArithmeticUnit();
	}
	
	public static void main(String args[]){
		if(args.length == 1) readFile(args[0]);
	}

	private static void readFile(String fileName) {
		
		
	}
	
	
	
}