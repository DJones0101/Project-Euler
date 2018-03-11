import java.math.BigInteger;

/**
 * Created by Darius Gaming on 5/28/2017.
 * <p>
 * <p>
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * <p>
 * What is the sum of the digits of the number 2^1000?
 */
public class ProjectEuler16 {


    public static int calculateSum(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            String z = c.toString();
            sum += Integer.parseInt(z);

        }


        return sum;
    }


    public static void main(String[] args) {

        long start = System.nanoTime();
        BigInteger n = new BigInteger("2");
        String ans = n.pow(1000).toString();

        long duration = System.nanoTime() - start;

        System.out.println("The answer is " + calculateSum(ans) + " Duration " + duration / 1000000 + "ms");


    }


}
