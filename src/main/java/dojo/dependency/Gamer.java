package dojo.dependency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Gamer {

    private FizzBuzz fizzBuzz;
	private BufferedReader br;
	private PrintStream out;

	public static void main(String... args) {
            new Gamer(new FizzBuzz()).play();
    }
    
    public Gamer(FizzBuzz fizzbuzz) {
    	this.fizzBuzz = fizzbuzz;
    	br = new BufferedReader(new InputStreamReader(System.in));
    	out = System.out;
    }

    public void play() {
            String input = read();
            int pos = input.indexOf(',');
            int start = Integer.parseInt(input.substring(0, pos));
            int stop = Integer.parseInt(input.substring(pos + 1));
            for (String element : fizzBuzz.play(start, stop)) {
					out.printf("%s ", element);
            }
    }

    public String read() {
            out.println("fizz buzz: ");
            try {
                    return br.readLine();
            } catch (IOException ioe) {
                    return null;
            }
    }
}