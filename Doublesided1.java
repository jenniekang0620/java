import java.util.Scanner;

public class Doublesided1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number");
        int num = in.nextInt();

        if(num%2==0) {
            System.out.print("even");
        }else {
            System.out.print("odd");
        }

    }
}
