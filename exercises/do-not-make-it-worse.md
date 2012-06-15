It is hard to build a house over a swampy base. Adding a new functionality to a legacy code base is basically the same thing. A quick fix looks like a good short term solution, but if you think in long terms you need something different than a quick fix. With the following exercise you can practice how to add a new functionality to a legacy code so that the old functionalities stay intact.

The exercise have three distinguished steps:

1. Write high level test cases which cover all the important aspects of your legacy code (100% coverage)

2. Refactor your legacy code

3. Add the new functionality using Test Driven Development - write the test cases of the new functionality first

There is a nice legacy code in [`dojo.legacy.fizzbuzz`](https://github.com/ZsoltFabok/dojo.exercises/tree/master/src/main/java/dojo/legacy/fizzbuzz) package. The `FizzBuzz.java` is an implementation of the Fizz-Buzz game ([description](https://github.com/ZsoltFabok/dojo.exercises/blob/master/exercises/i-am-new-to-this-game.md)). The new functionality is very simple:

- If the number can be divided by seven, then replace the number with *Flipp*

- If the number can be divided by eleven, then replace the number with *Flopp*

- If the number can be divided by seventy-seven, then replace the number with *FlippFlopp*


You can put your code under the [dojo.legacy.fizzbuzz](https://github.com/ZsoltFabok/dojo.exercises/tree/master/src/main/java/dojo/legacy/fizzbuzz) package. You can start your journey with a test case like this:

```java

  public class FizzBuzzTest {
    @Test
    public void shouldReturnOneForOne() {
      assertArrayEquals(new String[]{"1"}, new FizzBuzz().play(1, 1);
    }
  }
```