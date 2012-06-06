There are cases when deleting legacy code does more good than fixing it. The aim of this exercise is to show a secure way to do this by writing good test cases, which ensure that the functionality of the legacy code is saved, however the implementation is gone.

The exercise have three distinguished steps:

1. Write high level test cases which cover almost every important aspect of your legacy code

2. Hang around a bit and try to refactor the legacy code, but don't pressure it

3. Give up, and delete the legacy code and build it up from scratch using the test cases you wrote in step 1


If you are ready the code, the `dojo.legacy.currencyformat` package is waiting for you. It is often hard to find a good way to start, so here is a simple test case for you:

```java

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
    public void shouldPrintOneForOne() throws IOException {
        HungarianCurrencyFormatter.main(new String[]{"1"});
        assertEquals("Your number (1) is written like this in Hungarian: \"1\"" + NL, standardOutput.toString());
    }

    private void redirectStandardOutput() {
        originalStandardOutput = System.out;
        standardOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(standardOutput, true));
    }

    private void resetStandardOutputRedirection() {
         System.setOut(originalStandardOutput);
    }
```

Good luck, and don't forget to commit your changes into your fork repository!