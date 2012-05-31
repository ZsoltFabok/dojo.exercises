package dojo.dependency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gamer {

    public static void main(String... args) {
            new Gamer().play();
    }

    public void play() {
            String input = read();
            FizzBuzz fizzBuzz = new FizzBuzz();
            int pos = input.indexOf(',');
            int start = Integer.parseInt(input.substring(0, pos));
            int stop = Integer.parseInt(input.substring(pos + 1));
            for (String element : fizzBuzz.play(start, stop)) {
                    System.out.printf("%s ", element);
            }
    }

    public String read() {
            System.out.println("fizz buzz: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                    return br.readLine();
            } catch (IOException ioe) {
                    return null;
            }
    }
}