package dssc.assignment.fizzbuzz;


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

    public String convert(int number) {
        //return null;
        //return "1";

        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0){
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }
}
