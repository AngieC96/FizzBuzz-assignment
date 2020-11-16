package dssc.assignment.fizzbuzz;


/**
 * Extended version
 * We want our Java program to print numbers from 1 to 105 and apply these additional rules.
 *
 * For multiples of 7 it prints Bang instead of the number.
 * For numbers which are multiples of both 3 and 7 it prints FizzBang.
 * For numbers which are multiples of both 5 and 7 it prints BuzzBang.
 * For numbers which are multiples of 3, 5 and 7 it prints FizzBuzzBang.
 */
public class FizzBuzzExtended {

    public static void main(String... args) {

        boolean flag = true;
        for(int i = 1; i <= 105; i += 1){
            if (i % 3 == 0) {
                System.out.print("Fizz");
                flag = false;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                flag = false;
            }
            if (i % 7 == 0) {
                System.out.print("Bang");
                flag = false;
            }
            if (flag) {
                System.out.print(i);
            }

            flag = true;
            System.out.println("");
        }

    }

}
