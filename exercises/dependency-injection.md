
Working code doesn't necessary means testable code. I admit that the first thing is more important, but it is possible to write working and testable code. The aim of this exercise is to learn the basics of [dependency injection](http://en.wikipedia.org/wiki/Dependency_injection), which is the first step for a testable code. If this is the first time that you hear about dependency injection, please read the linked Wikipedia article first, but come back and do this tiny exercise.

There a running version of FizzBuzz in the [dojo.dependency](https://github.com/ZsoltFabok/dojo.exercises/tree/master/src/main/java/dojo/dependency) package. Your goal is to introduce dependency injection in this code. Here are the recommended steps:

1. write some test cases in order to keep the legacy functionality intact 
2. refactor your code so that the `FizzBuzz` is injected into the `Gamer`
3. move the FizzBuzz related tests to their right place: `FizzBuzzTest`
4. the `Gamer` does a lot of things. Move these things into a separate class
5. inject this separate class into the `Gamer`
6. refactor your test suite

Here is some help with the standard input and output handling:
```java
// Writes "something" to the standard input
ByteArrayInputStream inputStream = new ByteArrayInputStream("something".getBytes());
System.setIn(inputStream);


ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
System.setOut(new PrintStream(outputStream, true));

// Reads what's on the standard output
outputStream.toString();
```

Good luck!