/**
 * Created by Darius Jones on 5/26/2017.
 */
public class ProjectEuler12 {


    public static int countDivisors(long n) {
        int divisors = 0;

        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0) {
                divisors += 2;
            }
        }

        return divisors;
    }


    public static void main(String[] args) {


        boolean execute = true;
        int n = 1;
        int max = 500;

        while (execute) {

            int tNumber = n * (n + 1) / 2;


            if (countDivisors(tNumber) > max) {
                System.out.println("the first triangle number to have over five hundred divisors " + tNumber);
                execute = false;
            }

            n++;

        }
    }

}
