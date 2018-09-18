public class BeanPos {
    public static final double HST_RATE = .13;
    public static void main(String[] args) {

        int beanAmount = 5;
        double beanPrice = 1.50;

        double subTotal = beanAmount * beanPrice;
        double hstAmount = subTotal * HST_RATE;
        double finalTotal = subTotal + hstAmount;

        System.out.println("Sub Total: $" + subTotal
         + "\nHST Amt: $" + hstAmount
         + "\nFinal Total: $" + finalTotal);

    }
    }

