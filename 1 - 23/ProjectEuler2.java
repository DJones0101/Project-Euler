/**
 * Created by Darius Gaming on 5/19/2017.
 */
public class ProjectEuler2 {
    public static void main(String[] args) {
        int sum = 0;
        int x = 1;  // Represents the current Fibonacci number being processed
        int y = 2;  // Represents the next Fibonacci number in the sequence
        while (x <= 4000000) {
            if (x % 2 == 0) {
                sum += x;
            }
            int z = x + y;
            x = y;
            y = z;
        }
        System.out.println( Integer.toString(sum));
    }
}
