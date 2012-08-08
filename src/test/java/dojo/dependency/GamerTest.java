package dojo.dependency;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

import org.junit.Test;

public class GamerTest {

	@Test
	public void test() {
		ByteArrayInputStream inputStream = new ByteArrayInputStream("1,15".getBytes());
		System.setIn(inputStream);
		FakePrintStream fakePrintStream = new FakePrintStream();
		
		new Gamer(new FizzBuzz(), new BufferedReader(new InputStreamReader(System.in)), fakePrintStream).play();
		
		String output = fakePrintStream.toString();
		assertEquals("fizz buzz: \r\n1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz ", output);
	}
	
	class FakeBufferedReader extend Buffered
	
	class FakePrintStream extends PrintStream {
		private StringBuilder sb = new StringBuilder();
		private String nl = System.getProperty("line.separator");

		public FakePrintStream() {
			super(System.out);
		}
		
		@Override
		public PrintStream printf(String format, Object... objects) {
			for(Object object : objects) {
				sb.append(object);
				sb.append(" ");
			}
			return null;
		}
		
		@Override
		public void println(String string) {
			sb.append(string + nl);
		}
		
		public String toString () {
			return this.sb.toString();
		}
	}
	
	//class FakeBufferedReader extends BufferedReader {
		
	//}

}
