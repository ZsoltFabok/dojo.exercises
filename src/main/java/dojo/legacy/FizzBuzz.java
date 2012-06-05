package dojo.legacy;

public class FizzBuzz {	
	public String[] play(int start, int stop) {
		 if (start > 0 && start <= stop) {
		     return evaluateNumRange(start, stop, stop-start+1);
		 } else {
		     throw new IllegalArgumentException();
		 }
	 }
	 
	 public String[] evaluateNumRange(int start, int stop, int length) {
	     String[] numbers = new String[length];
	     int number;
	     for (int i = 0; i < length; i++) {
	        number = start + i;
			if (number % 15 == 0) {
				numbers[i]="FizzBuzz";
	        } else if (number % 5 == 0) {
	        	numbers[i]="Buzz";
            } else if (number % 3 == 0) {
                numbers[i]="Fizz";
            } else {
            	numbers[i] =  "" + number;
            }
	     }
	     return numbers;
	 }
}