package dojo.dependency;

public class InputParser {
	private FizzBuzz fizzBuzz;
	private StringBuilder result = new StringBuilder();
	
	public InputParser(FizzBuzz fb) {
		this.fizzBuzz = fb;
	}
	
	public String parse(String input) {
		int pos = input.indexOf(',');
        int start = Integer.parseInt(input.substring(0, pos));
        int stop = Integer.parseInt(input.substring(pos + 1));
        for (String element : fizzBuzz.play(start, stop)) {
				result.append(element + " ");
        }
        return result.toString();
	}
}
