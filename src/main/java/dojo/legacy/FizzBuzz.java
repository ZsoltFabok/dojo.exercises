package dojo.legacy;

public class FizzBuzz {
	public String[] play(final int start, final int stop) {
		if (start <= 0 || stop < start) {
			throw new IllegalArgumentException();
		}

		final int length = stop - start + 1;
		final String[] array = new String[length];
		for (int ind = 0; ind < length; ind++) {
			final int pos = start + ind;
			if (pos % 15 == 0) {
				array[ind] = "FizzBuzz";
			} else if (pos % 5 == 0) {
				array[ind] = "Buzz";
			} else if (pos % 3 == 0) {
				array[ind] = "Fizz";
			} else {
				array[ind] = Integer.toString(pos);
			}
		}
		return array;
	}
}