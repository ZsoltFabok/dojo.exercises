package dojo.dependency;

import java.io.PrintStream;

public class OutputHandler {
	private PrintStream output;
	
	public OutputHandler(PrintStream out) {
		this.output = out;
	}

	public void writef(String format, Object object) {
		output.printf(format, object);
	}
	
	public void writeln(String s) {
		output.println(s);
	}
}
