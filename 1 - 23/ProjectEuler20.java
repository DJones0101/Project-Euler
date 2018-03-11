import java.math.BigInteger;

/**
 * Created by Darius Jones on 6/2/2017.
 * <p>
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * <p>
 * Find the sum of the digits in the number 100!
 */
public class ProjectEuler20 {

    public static String factorial(Integer n) {

        BigInteger factorial = BigInteger.ONE;

        for (Integer i = n; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial.toString();
    }


    public static void main(String[] args) {

        long start = System.nanoTime();

        String number = factorial(100);

        int sum = 0;


        for (int i = 0; i < number.length(); i++) {

            sum +=(number.charAt(i)-48);
        }

        float duration = System.nanoTime() - start;

        System.out.println("The answer is " + sum + " " + (duration / 1000000000) + " second(s) Duration");


    }


}
