/**
 * Created by dariusjones on 5/21/17.
 */
public class ProjectEuler5 {


    public static boolean isMul(int smallest) {
        return (smallest % 11 == 0) && (smallest % 12 == 0) && (smallest % 13 == 0)
                && (smallest % 14 == 0) && (smallest % 15 == 0) && (smallest % 16 == 0) &&
                (smallest % 17 == 0) && (smallest % 18 == 0) &&
                (smallest % 19 == 0) && (smallest % 20 == 0);
    }

    public static void main(String[] args) {
        int smallest = 2520;

        boolean run = true;

        while (run) {

            if (isMul(smallest)) {
                run = false;
            } else {
                smallest++;
            }
        }

        System.out.printf("The answer is %d", smallest);

    }
}
