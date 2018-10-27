import java.util.Scanner;

public class ConditionalQu2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int randomNum = (int)(Math.random()*5 + 1);

        System.out.println("Guess my number");

        int guess = in.nextInt();
        String result = guess == randomNum ? "Corrrect" : "Incorrect";

        System.out.println(result);
    }
}
