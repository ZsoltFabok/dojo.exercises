package dojo.dependency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Gamer {

    private FizzBuzz fizzBuzz;
	private BufferedReader bufReader;
	private PrintStream printOut;

	public static void main(String... args) {
            new Gamer(new FizzBuzz(), new BufferedReader(new InputStreamReader(System.in)), System.out).play();
    }
    
    public Gamer(FizzBuzz fizzbuzz, BufferedReader bufferedReader, PrintStream out) {
    	this.fizzBuzz = fizzbuzz;
    	this.bufReader = bufferedReader;
    	this.printOut = out;
    }

    public void play() {
            String input = read();
            int pos = input.indexOf(',');
            int start = Integer.parseInt(input.substring(0, pos));
            int stop = Integer.parseInt(input.substring(pos + 1));
            for (String element : fizzBuzz.play(start, stop)) {
					printOut.printf("%s ", element);
            }
    }

    public String read() {
            printOut.println("fizz buzz: ");
            try {
                    return bufReader.readLine();
            } catch (IOException ioe) {
                    return null;
            }
    }
}