package dojo.legacy.currencyformat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class HungarianCurrencyFormatterTest {
    private static final String NL = System.getProperty("line.separator");
    private PrintStream originalStandardOutput;
    private OutputStream standardOutput;

    @Before
    public void setUp() {
        redirectStandardOutput();
    }

    @After
    public void tearDown() {
        resetStandardOutputRedirection();
    }

    @Test
    public void shouldLeaveANumberWithTheLenghOneUntouched() throws IOException {
        HungarianCurrencyFormatter.main(new String[]{"1"});
        assertEquals("Your number (1) is written like this in Hungarian: \"1\"" + NL, standardOutput.toString());
    }

    @Test
    public void shouldLeaveANumberWithTheLenghThreeUntouched() throws IOException {
        HungarianCurrencyFormatter.main(new String[]{"100"});
        assertEquals("Your number (100) is written like this in Hungarian: \"100\"" + NL, standardOutput.toString());
    }

    @Test
    public void shouldPrintSpacesBetweenThousands() throws IOException {
        HungarianCurrencyFormatter.main(new String[]{"1000000"});
        assertEquals("Your number (1000000) is written like this in Hungarian: \"1 000 000\"" + NL, standardOutput.toString());
    }

    @Test
    public void shouldReplaceDotWithComa() throws IOException {
        HungarianCurrencyFormatter.main(new String[]{"100.1"});
        assertEquals("Your number (100.1) is written like this in Hungarian: \"100,1\"" + NL, standardOutput.toString());
    }

    @Test
    public void shouldReplaceDotWithComaAlsoForNumberGreaterThanThousand() throws IOException {
        HungarianCurrencyFormatter.main(new String[]{"1000.1"});
        assertEquals("Your number (1000.1) is written like this in Hungarian: \"1 000,1\"" + NL, standardOutput.toString());
    }

    @Test
    public void shouldNotPrintAnythingforZeroArguments() throws IOException {
        HungarianCurrencyFormatter.main(new String[]{});
        assertTrue(standardOutput.toString().isEmpty());
    }

    @Test
    public void shouldNotPrintAnythingforMoreThanTwoArguments() throws IOException {
        HungarianCurrencyFormatter.main(new String[]{"2", "0"});
        assertTrue(standardOutput.toString().isEmpty());
    }

    private void redirectStandardOutput() {
        originalStandardOutput = System.out;
        standardOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(standardOutput, true));
    }

    private void resetStandardOutputRedirection() {
         System.setOut(originalStandardOutput);
    }
}
