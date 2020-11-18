package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Convert {

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
    @CsvSource({"1, 1", "2, 2", "40, 40"})
    // We can provide the pair (expected, number) that will be used by  Junit to run this test multiple times
    // This test counts as three tests!!!!
    void numbers_not_divisible_by_3_or_5_to_strings(int number, String expected) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(expected, fizzBuzz.convert(number));
    }
}
