import java.util.Scanner;

public class Doublesided6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter hours worked");
        double hours = in.nextDouble();
        double pay = 0;

        if(hours<=40){
           pay = hours *10;
        }else{
               pay = 400 + (hours-40)*15;
            }
       System.out.printf("Amount of pay : $%.2f%n", pay);
    }
}
