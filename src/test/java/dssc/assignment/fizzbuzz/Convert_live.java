package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Convert_live {

    // Test in JUnit5 file are methods with an annotation (???)
    //@Test
    //void test() {
    //    Assertions.fail();  // To see that our gradle configuration is working
    //}

    @Test
    void number_1_to_string_1(){
        // Arrange → data, classes, ... that we want to use in our test
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act
        //String numberAsString = fizzBuzz.convert(1); // method that we don't have yes but that we will create

        // Assert → thing to check
        //Assertions.assertEquals("1", numberAsString);
        Assertions.assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    void all_numbers(){
        int n = 100;
        String []a = new String[n + 1];
        for(int i = 0; i <= n; ++i) {
            a[i] = "" + i;
        }
        for(int i = 3; i < a.length; i += 3) {
            a[i] = "Fizz";
        }
        for(int i = 5; i < a.length; i += 5) {
            a[i] = "Buzz";
        }
        for(int i = 15; i < a.length; i += 15) {
            a[i] = "FizzBuzz";
        }

        FizzBuzz fizzBuzz = new FizzBuzz();

        for(int i = 1; i <= n; ++i){
            //System.out.println(a[i]);
            assertEquals(a[i], fizzBuzz.convert(i));
        }
    }

}
