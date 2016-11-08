/**
 * Created by Администратор on 18.09.2016.
 */
public class Stepic2_3 {
    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1,0.2,0.3));

    }

    public static boolean doubleExpression(double a, double b, double c) {

        return Math.abs(a) + Math.abs(b) == Math.abs(c);
    }
}
