public class ConditionalQu1 {

    public static void main(String[] args) {

        String coin = (Math.random()<0.5)? "HEADS" : "TAILS";

        System.out.println(coin);
    }
}
