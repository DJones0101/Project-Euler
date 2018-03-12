/**
 * Created by Darius Jones on 5/20/2017.
 */
public class ProjectEuler3 {
    public static void main(String[] args) {
        long a = 600851475143L, c = 0, b = 2;

        while (a > b) {

            if (a % b == 0) {
                a /= b;
                b = 2;
            } else if (a % b != 0) {
                b++;
                if (a % b == 0) {
                    a /= b;
                }
            }
            c = b;

        }
        System.out.println(c);
    }
}
