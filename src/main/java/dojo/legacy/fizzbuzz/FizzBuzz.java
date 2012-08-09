package dojo.legacy.fizzbuzz;

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
	     boolean primesFound = false;
	     for (int i = 0; i < length; i++) {
	        number = start + i;
	        if (number % 7 == 0) {
				if (numbers[i] == null) numbers[i] = "Flipp";
				else numbers[i] = numbers[i] + "Flipp";
				primesFound = true;
			}
	        if (number % 11 == 0){
	        	if (numbers[i] == null) numbers[i] = "Flopp";
	        	else numbers[i]= numbers[i] + "Flopp";
	        	primesFound = true;
	        }
			if (number % 3 == 0) {
            	if (numbers[i] == null) numbers[i] = "Fizz";
            	else numbers[i] = numbers[i] + "Fizz";
            	primesFound = true;
            }
			if (number % 5 == 0) {
				if (numbers[i] == null) numbers[i] = "Buzz";
				else numbers[i] = numbers[i] + "Buzz";
				primesFound = true;
			}
            if (!primesFound) {
            	numbers[i] =  "" + number;
            	primesFound = false;
            }
            //System.out.println("numbers[" + i + "] = " + numbers[i]);
	     }
	     return numbers;
	 }
}