/*
 * Name:  Jisung Kang
 * Assignment:  Lab 2
 * Program: Computer Programmer
 * Calculates the length of slope and a mid-point, distance.  values are entered by the user.
 */


import java.util.Scanner;

public class Kangjis_Lab2 {
     public static void main(String[] args) {

          // create a scanner for user keyboard input
          Scanner in = new Scanner(System.in);

          // print out Reading Point P
          System.out.println("Reading Point P: ");

          // get the point P values from user
          System.out.println("Enter X-Value: ");
          double valuePX1 = in.nextDouble();
          System.out.println("Enter Y-Value: ");
          double valuePY1 = in.nextDouble();

          // print out Reading Point Q
          System.out.println("Reading Point Q: ");

          // get the point Q values from user
          System.out.println("Enter X-Value: ");
          double valueQX2 = in.nextDouble();
          System.out.println("Enter Y-Value: ");
          double valueQY2 = in.nextDouble();

          // calculate the length of slope
          double slope = (valueQY2 - valuePY1) / (valueQX2 - valuePX1);

          // calculate the mid-point
          double midpoint1 = (valuePX1 + valueQX2) / 2 ;
          double midpoint2 = (valuePY1 + valueQY2) / 2 ;

          // calculate the distance between points P and Q
          double distance = Math.sqrt(Math.pow(valueQX2 - valuePX1, 2) + Math.pow(valueQY2 - valuePY1, 2));

          // display the slope, mid-point, distance
          System.out.println("A Line connected by P(" + valuePX1 + ", " + valuePY1 + ") and Q(" + valueQX2 + ", " + valueQY2 + ")");
          System.out.printf("- Has a slope of %4.2f\n", slope);
          System.out.printf("- Has a mid-point of (%3.1f, %3.1f)\n", midpoint1, midpoint2);
          System.out.printf("The distance between P and Q is %4.2f\n", distance);
     }
}

