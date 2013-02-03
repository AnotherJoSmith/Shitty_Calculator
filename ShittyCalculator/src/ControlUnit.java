
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

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
	
	public static void main(String[] args){
		if(args.length == 1) readFile(args[0]); //Read input from a .txt file.
		else readLine(); //No file was given, asks for input.
	}

	private static void readLine() {
		
	}

	private static void readFile(String fileName) {
		try {
			System.out.println(fileName);
			BufferedReader in = new BufferedReader(new FileReader(fileName));
			 String command = in.readLine();
			 if(command != null) {
				 String result = interpertCommand(command);
				 PrintWriter writer= new PrintWriter("/testOutput.txt");
				 writer.println(result);
				 
			 }
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
			System.exit(0); //Kind of brutal exit, but will do for now.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private static String interpertCommand(String command) {
		return command;
		// TODO Auto-generated method stub
		
	}	
}
}
}
