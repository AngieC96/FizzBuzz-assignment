package dssc.assignment.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Convert {

    private final FizzBuzz fizzBuzz = new FizzBuzz();  // instance of fizzBuzz as a field for our class
    // We can do this because JUnit creates a new instance of each test class before executing each test method
    // Each test will have its own instance of fizzBuzz to run

//    @Test
//    void number_1() {
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        assertEquals("1", fizzBuzz.convert(1));
//    }
//
//    @Test
//    void number_2() {
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        assertEquals("2", fizzBuzz.convert(2));
//    }
//
//    @Test
//    void number_40() {
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        assertEquals("40", fizzBuzz.convert(40));
//    }

    @ParameterizedTest
//    @CsvSource({"1, 1", "2, 2", "40, 40"})
    @CsvSource({"1, 1", "2, 2", "41, 41"})
    // We can provide the pair (expected, number) that will be used by  Junit to run this test multiple times
    // We write "1,1" instead of (1,"1") since it's a csv file so you can only have test/strings inside it! JUnit will convert the string into the number
    // This test counts as three tests!!!!
    void numbers_not_divisible_by_3_or_5_to_strings(int number, String expected) {
        //FizzBuzz fizzBuzz = new FizzBuzz();  // Ctrl + Alt + f: Extract/Introduce → Introduce Field, Ctrl + Alt + O: Optimize Imports
        assertEquals(expected, fizzBuzz.convert(number));
    }

//    @Test
//    void number_3_to_Fizz() {
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        assertEquals("Fizz", fizzBuzz.convert(3));
//    }
//
//    @Test
//    void number_6_to_Fizz() {
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        assertEquals("Fizz", fizzBuzz.convert(6));
//    }
//
//    @Test
//    void number_24_to_Fizz() {
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        assertEquals("Fizz", fizzBuzz.convert(24));
//    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 24})
    // Since we need to provide only one argument to our test
    void multiples_of_3_to_Fizz(int number) {
        //FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 100})
    void multiples_of_5_to_Buzz(int number) {
        //FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 45, 75})
    void multiples_of_3_and_5_to_FizzBuzz(int number) {
        //FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.convert(number));
    }
}

