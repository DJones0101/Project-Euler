/**
 * Created by Darius Jones on 5/24/2017.
 */
public class ProjectEuler9 {
    public static void main(String[] args) {
        int a, b, c;
        int limit = 1000;
        int sq = (int) Math.sqrt(1000);

        for (int n = 1; n < sq; n++) {
            for (int m = 2; m <= sq; m++) {
                a = m * m - n * n;
                b = 2 * m * n;
                c = m * m + n * n;

                if (a + b + c == limit) {
                    int product = a * b * c;
                    System.out.printf("a = %d, b = %d, c = %d, product = %d", a, b, c, product);
                    break;

                }
            }
        }
    }
}
