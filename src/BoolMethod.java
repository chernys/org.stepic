/**
 * Created by Администратор on 13.09.2016.
 */
public class BoolMethod {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        System.out.println(booleanExpression(a, b, c, d));
                }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d){
        return (a | b | c | d) && !(a & b & c & d) && !(a ^ b ^ c ^ d);
    }
}
