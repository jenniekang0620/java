import java.util.Scanner;

public class BooleanStuff {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s1 = "hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("True or False: Java was invented by a Canadian.");
        //boolean answer = in.nextBoolean();
        String strAnswer = in.next();
        boolean answer = Boolean.parseBoolean(strAnswer);
        //boolean answer = Boolean.parseBoolean(in.next());

        System.out.println("Your answer: " + answer);
    }
}