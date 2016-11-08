/**
 *
 * A programs that print <code>Hello world</code>
 *@version 1.0
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(saleCount(97.6, 87.84));
    }

    public static double saleCount(double price, double result) {
        double dif = price - result;
        double discount = dif * price / 100;
        return discount;
    }
}
