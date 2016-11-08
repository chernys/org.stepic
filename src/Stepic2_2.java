/**
 * Created by Администратор on 18.09.2016.
 */
public class Stepic2_2 {
    public static void main(String[] args) {

        System.out.println(leapYesrCount(2016));

    }

    public static  int leapYesrCount(int year){

        return year/4-year/100+year/400;
    }
}
