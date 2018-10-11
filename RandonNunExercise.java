import java.util.Scanner;

public class RandonNunExercise {

    public static void main(String[] args) {

        // create a Scanner for keyboard input
        Scanner in = new Scanner(System.in);

        // generate two random numbers
        int random1 = (int)(Math.random() * 10) + 1;
        int random2 = (int)(Math.random() * 10) + 1;

        // show the question
        System.out.printf("What is %d + %d?", random1, random2);

        // get the user's input and actual answer
        int userAnswer = in.nextInt();
        int actualAnswer = random1 + random2;

        // display the user's result
        System.out.printf("%d + %d = %d is %B%n", random1, random2, userAnswer,
                           actualAnswer == userAnswer);

    }
}
