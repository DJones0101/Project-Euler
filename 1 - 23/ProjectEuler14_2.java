import java.util.HashMap;
import java.util.Map;

/**
 * Created by Darius Jones on 5/28/2017.
 */


public class ProjectEuler14_2 {



    public static void main(String[] args) {
        Map<Integer, Integer> table = new HashMap<>();
        int max = 1;
        int startNumber = 1;
        int count = 0;

        long start = System.nanoTime();
        table.put(1,0);
        for (int i = 2; i <= 1000000; i++) {
            long n = i;

                count = 0;
            do {
                // Counting the numbers in the chain
                ++count;
                // if n is a number in the hash table break out of the loop to save time
                if (table.containsKey((int)n)){
                    count += table.get((int)n);
                    break;
                }
                // Do the Collatz calculation
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
            } while (n != 1); // Stop when we get to the number 1

            table.put(i,count); // After we reach one add the number (i) the start number and the count to the table;

            if(count > max){ // Keeping track of the max and the start number
                max = count;
                startNumber = i;
            }
        }
        long duration =System.nanoTime() - start;
        System.out.println(" Number " + startNumber);
        System.out.println((duration / 1000000000) + " second(s)");




    }


}
