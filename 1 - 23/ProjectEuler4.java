/**
 * Created by Darius Jones on 5/21/2017.
 */
public class ProjectEuler4 {

    public static boolean isPal(String s) {
        StringBuilder string = new StringBuilder(s);
        return s.equals(string.reverse().toString());
    }

    public static boolean isPal(int x) {
        return isPal(Integer.toString(x));
    }


    public static void main(String[] args) {


        int maxPal = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int product = i * j;

                if (isPal(product) && product > maxPal) {
                    maxPal = product;
                }

            }

        }
        System.out.println(maxPal);
    }
}
