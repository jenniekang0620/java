
public class ConditionalQu3 {

    public static void main(String[] args) {

        int die1 = (int)(Math.random()*6+1);
        int die2 = (int)(Math.random()*6+1);

        String result = (die1 == die2) ? "You win" : "die1, die2";

        System.out.print(result);


    }
}
