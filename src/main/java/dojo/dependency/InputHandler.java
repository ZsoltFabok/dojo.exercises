package dojo.dependency;

import java.io.BufferedReader;
import java.io.IOException;

public class InputHandler {
	BufferedReader reader;
	
	public InputHandler(BufferedReader reader) {
		this.reader = reader;
	}
	
	public String readInput() {
		try {
            return reader.readLine();
	    } catch (IOException ioe) {
            return null;
	    }
	}
}
