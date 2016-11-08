/**
 * Реализуйте метод flipBitб изменяющий значение одного бита целочисленного
 * числа на противоположное.
 * Договоримся что биты нумеруются от младшего (индэкс 1) к старшему (индэкс 32)
 * @param value any number
 * @param bitIndex index of the bit to flip, 1<=bitIndex<=32
 */
public class Stepic2_1_15 {
    public static void main(String[] args) {
        System.out.println(flipBit(34, 5));
    }

    public static int flipBit(int value, int bitIndex) {
        return (value ^ (1 << (bitIndex - 1)));
    }
}
