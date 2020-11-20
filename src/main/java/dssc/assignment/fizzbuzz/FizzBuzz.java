package dssc.assignment.fizzbuzz;


import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * FizzBuzz assignment
 * We want to write a Java program that prints the numbers from 1 to 100 to the
 * "standard" output stream and follows these rules.
 *
 * For multiples of 3 it prints Fizz instead of the number.
 * For multiples of 5 it prints Buzz instead of the number.
 * For numbers which are multiples of both 3 and 5 it prints FizzBuzz.
 */
public class FizzBuzz {

    public static void main(String... args) {

        for(int i = 1; i <= 100; i += 1){
            if (i % 3 == 0){
                System.out.printf("Fizz");
            }
            if (i % 5 == 0){
                System.out.printf("Buzz");
            } else {
                if (i % 3 != 0) {
                    System.out.printf("" + i);
                }
            }
            System.out.println("");
        }

        // Interesting version
//        boolean flag = true;
//        for(int i=0;i<16;i++){
//            if(i%3==0){
//                System.out.print("Fizz");
//                flag=false;
//            }
//            if(i%5==0){
//                System.out.print("Buzz");
//                flag=false;
//            }
//            if (flag)
//                System.out.print(i);
//            System.out.print(",");
//            flag = true;
//        }
    }

    //public String convert(int number) {  // vague!!!
    public String numberToFizzBuzz(int number) {
        //return null;
        //return "1";
        if (isMultipleOfThreeAndFive(number)) {
            return "FizzBuzz";
        } else if (isMultipleOfFive(number)) {
            return "Buzz";
        } else if (isMultipleOfThree(number)) {
            return "Fizz";
        } else {
            return Integer.toString(number);
        }
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }

    private boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOfThreeAndFive(int number) {
        return number % 15 == 0;
    }

    // public void print() {  // vague!!!
    public void generateAndPrintFizzBuzzes() {
        Stream<String> fizzBuzzes = IntStream.range(1, 101).mapToObj(this::numberToFizzBuzz);   // I can understand that I'm mappign number to FizzBuzzes!
        System.out.println(fizzBuzzes.collect(Collectors.joining(", ")));
    }
}
