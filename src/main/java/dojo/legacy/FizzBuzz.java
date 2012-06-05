package dojo.legacy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	 public String[] play(int start, int stop) {
		 if (argumentsAreValid(start, stop)) {
			 List<String> numbers = new ArrayList<String>();
			 for (int i = start; i < stop + 1; i++) {
				 numbers.add(convertNumber(i));
			 }
			 return numbers.toArray(new String[]{});
		 } else {
		     throw new IllegalArgumentException();
		 }
	 }

	private String convertNumber(int number) {
		String result = new String();
		if (number % 15 == 0) {
		     result = "FizzBuzz";
		 } else if (number % 5 == 0) {
			 result = "Buzz";
		 } else if (number % 3 == 0) {
			 result = "Fizz";
		 } else {
		     result = Integer.toString(number);
		 }
		return result;
	}

	private boolean argumentsAreValid(int start, int stop) {
		return start > 0 && start <= stop;
	}
}