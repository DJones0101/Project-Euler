/**
 * Created by Darius Jones on 5/21/2017.
 */
public class ProjectEuler7 {
    public static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int count = 0;
        int i;

        for (i = 0; count != 10001; i++) {
            if (isPrime(i)) {
                count++;

            }
        }

        System.out.printf("%d is the %dth prime number\n", i, count);


    }
}
