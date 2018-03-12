/**
 * Created by Darius Jones on 5/28/2017.
 *
 * Redo with Hashmap
 *
 */
public class ProjectEuler14 {

    public static int collatzConjectureCount(long n) {
        int count = 1;
        while (n != 1) {
            if (n % 2 == 0) {

                n = n / 2;


            } else {

                n = 3 * n + 1;


            }
            count++;

        }
        return count;
    }

    public static void main(String[] args) {
        final long startTime = System.nanoTime();
        int largest = 0;
        int compare;
        int i;

        for (i = 1; i <= 999999; i++) {
            compare = collatzConjectureCount(i);
            if (compare > largest) {
                largest = collatzConjectureCount(i);

            }
            if (largest == 525) {
                break;
            }

        }
        final long duration = System.nanoTime() - startTime;

        System.out.println("The starting number " + i + " produces the longest chain of " + largest);
        long seconds = duration / 1000000000;
        System.out.println(seconds + " seconds runtime");


    }
}
