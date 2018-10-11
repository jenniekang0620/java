import java.util.Scanner;

public class LogicalOperator {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        int x = 1;
        System.out.println((x > 1) && (x++ > 1));
        System.out.println(x);
    }
}