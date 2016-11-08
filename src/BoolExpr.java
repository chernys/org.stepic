/**
 * Created by Администратор on 11.09.2016.
 */
public class BoolExpr {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = a | b;

        System.out.println("|" + " " + c);
        c = a || b;
        System.out.println("||" + " " + c);
        c = a & b;
        System.out.println("&" + " " + c);
        c=a==b;
        System.out.println("==" + " " + c);
        c=a^b;
        System.out.println("^" + " " + c);
        c=a!=b;
        System.out.println("!=" + " " + c);
    }
}
