/**
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
 * Допустимая погрешность – 0.0001 (1E-4)
 */
public class Stepic2_1_12 {
    public static void main(String[] args) {
        System.out.println(doubleExpresseion(0.1, 0.2, 0.3));
    }

    public static boolean doubleExpresseion(double a, double b, double c) {
        return ((a + b) - ((a + b) % 0.0000000000000001) == c);
    }
}
