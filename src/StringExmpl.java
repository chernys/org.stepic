/**
 * Created by Администратор on 08.11.2016.
 */
public class StringExmpl {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append("world");
        String newStr = sb.toString();
        System.out.println(newStr);

        char[] charArray = {'h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'};
        String str = new String(charArray);
        System.out.println(str);

        char[] charsFromString = str.toCharArray();
        int lenght = charsFromString.length;
        for (int i = 0; i < lenght; i++) {
            System.out.println(charsFromString[i]);
        }


    }
}
