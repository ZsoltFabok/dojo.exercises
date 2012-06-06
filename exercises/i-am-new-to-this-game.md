You look like a developer who would like to learn more how to develop software in the Agile way. Well, you are at the right place. As your first project, try to implement the famous Fizz-Buzz game using Test Driven Development (TDD). The TDD cycle suggests that you write a small test case first, and implement just enough logic to make this test pass. Then, you write the next test case, and implement again just enugh logic until the second test case is still green. Mind that the first test case must be green as well. Now take a small break, and when you are back refactor your code. Continue with these steps until the code is ready.

The rules of the Fizz-Buzz game is very simple. If you have a number,

- which can be divided by three, then you replace it with Fizz

- which can be divided by five, then you replace it with Buzz

- which can be divided by fifteen, then you replace it with FizzBuzz

For example:

- input: 2, 3, 4, 5, 6

- output: 2, Fizz, 4, Buzz, 6

Here is a recommended class signature for your project:

```java

  public class FizzBuzz {
      public String[] play(int start, int stop) {
          // your solution
      }
  }
```

You can put your code under the [dojo.basics](https://github.com/ZsoltFabok/dojo.exercises/tree/master/src/main/java/dojo/basics) package. Here a sample test case:

```java

  public class FizzBuzzTest {
    @Text
    public void shouldReturnOneForOne() {
      assertArrayEquals(new String[]{"1"}, new FizzBuzz().play(1, 1);
    }
  }
```