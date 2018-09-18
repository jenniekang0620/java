public class TipCalculator {
    public static void main(String[] args){

        double billAmount = 35.1;
        double tipPercent = 15.0;
        double tipAmount = billAmount * (tipPercent / 100) ;

        System.out.println("Bill Amount: " + billAmount + "\tTip%: " + tipPercent
        + "\nTip Amount: $" + tipPercent);
    }

}
