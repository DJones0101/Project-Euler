import java.math.BigInteger;

/**
 * Created by Darius Jones on 5/28/2017.
 *
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
 * How many such routes are there through a 20×20 grid?
 *              n!
 * C(n,r) =   ———-
 *           r!*(n-r)!
 * 137846528820
 */
public class ProjectEuler15 {

    public static BigInteger factorial(int n) {

        BigInteger multiplier = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            multiplier = multiplier.multiply(BigInteger.valueOf(i));

        }

        return multiplier;

    }





    public static void main(String[] args) {
        int n = 40;
        int r = 20;

        System.out.println("The answer is " + factorial(n).divide(factorial(r).multiply(factorial(n - r))));


    }
}
