import java. util. Scanner;

public class ConditionalQu4 {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.println("Enter the cat's age");
        int num = in.nextInt();

        String result = num >= 14 || num <121 ? "ON" : "OFF";
        System.out.println(result);

    }
}
