package dojo.dependency;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Gamer {
	private InputHandler inputHandler;
	private InputParser inputParser;
	private OutputHandler outputHandler;

	public static void main(String... args) {
        new Gamer(new FizzBuzz(), new BufferedReader(new InputStreamReader(System.in)), System.out).play();
    }
    
    public Gamer(FizzBuzz fizzbuzz, BufferedReader in, PrintStream out) {
    	inputHandler = new InputHandler(in);
    	inputParser = new InputParser(fizzbuzz);
    	outputHandler = new OutputHandler(out);
    }

    public void play() {
		outputHandler.writeln("fizz buzz: ");
		String input = inputHandler.readInput();
        String result = inputParser.parse(input);
        outputHandler.writef("%s", result);
    }
}