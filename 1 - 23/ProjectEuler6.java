/**
 * Created by Darius Gaming on 5/21/2017.
 */
public class ProjectEuler6 {
    public static void main(String[] args) {
        long sum1 = 0;
        long sum2 = 0;
        long total;


        for (int i = 0; i <= 100; i++) {
            sum1 += i * i;
            sum2 += i;
        }

        total = (sum2 * sum2) - sum1;

        System.out.println("The answer " + total);
    }
}
