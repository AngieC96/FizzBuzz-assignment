package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Convert {

    // Test in JUnit5 file are methods with an annotation (???
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

}
