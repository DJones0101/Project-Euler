/**
 * Created by Darius Gaming on 5/25/2017.
 */
public class ProjectEuler10 {
    public static void eratosthenes(long n) {

        boolean prime[] = new boolean[(int) n + 1];

        long sumOfPrimes = 0;

        for (int i = 0; i < n; i++) {
            prime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                sumOfPrimes += i;
            }

        }

        System.out.println(sumOfPrimes);

    }

    public static void main(String[] args) {

        eratosthenes(2000000);

    }
}
