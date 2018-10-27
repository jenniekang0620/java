import java.util.Scanner;

public class ConditionalQu5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a department number");
        int num = in.nextInt();


       String result = ( num > 1 && num < 45 ) || ( num > 50 && num < 60) || num == 100 ? "valid"  : "invalid";
       System.out.println(result);

    }
}
