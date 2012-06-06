package dojo.legacy.fizzbuzz;

public class FizzBuzz {
	 public String[] play(int start, int stop) {
		 if (start > 0 && start <= stop) {
		     int length = stop - start + 1;
		     String[] array = new String[length];
		     for (int i = 0; i < length; i++) {
		         if ((start + i) % 15 == 0) {
		                 array[i]="Fizzbuzz";
		         } else
		                 if (start + i % 5 == 0) {
		                 array[i]="Buzz";
		                 } else { if ((start + i) % 3 == 0)
		                 array[i]="Fizz";
		         else {
		                 array[i] =  "" + (start + i);
		         }}
		     }
		     return array;
		 } else {
		     throw new IllegalArgumentException();
		 }
	 }
}