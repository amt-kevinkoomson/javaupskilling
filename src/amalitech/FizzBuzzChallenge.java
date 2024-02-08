package amalitech;

import java.util.Scanner;

public class FizzBuzzChallenge {
    public static void main(String...args){
        // create a method to accept a value
        // main method:
        // begin while loop, condition, while input is not zero
        // if input is not an integer, prompt to enter a valid integer and rerun input method
        // store modulo 3 and 5
        // evaluate checks to print fizz buzz or number
        Integer input = getIntegerOrExit();
        while (input != null){
            // perform calculations
            boolean fizz = input % 5 == 0;
            boolean buzz = input %3 == 0;
            // print statements
            if(fizz && buzz) System.out.println("FizzBuzz");
            else if (fizz) System.out.println("Fizz");
            else if (buzz) System.out.println("Buzz");
            else System.out.println(input);
            // get input again
            input = getIntegerOrExit();
        }
    }
    public static Integer getIntegerOrExit() {
        // accept input
        Scanner scanner=new Scanner(System.in);
        int input;
        System.out.println("Please enter an integer or 0 to exit: ");
        // check if user input is an integer
        if(scanner.hasNextInt()) {
            input = scanner.nextInt();
            if (input == 0) {
                scanner.close();
                System.exit(0);
            }
            return input;
        } else {
            System.out.println("Invalid input ");
            return getIntegerOrExit();
        }
    }
}

/**Note:
1. Nested If are considered bad practices?
2. This is not terribly bad—the more we nest the more confusing the code become—to other people
3. The more we build the more we realize that there is no way to build ideal software
4. Programming and problem-solving always a trade-offs
5. Every solution has a degree of strength, and weakness
6. Not having repetition but duplication??
7. But having nested structure that make the code had and read and understand would be really ideal?
 */
