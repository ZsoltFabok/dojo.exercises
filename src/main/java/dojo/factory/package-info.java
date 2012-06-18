/**
 * This exercise is designed to learn how-to introduce factories in the code for testability reasons.
 * 
 * Help to get standard output for integration test:
 * OutputStream outputStream = new ByteArrayOutputStream();
 * PrintStream testStdOut = new PrintStream(outputStream, true);
 * PrintStream originalStdOut = System.out;
 *
 * System.setOut(testStdOut);
 * // call
 *
 * // Important to set it back
 * System.setOut(originalStdOut);
 */
package dojo.factory;