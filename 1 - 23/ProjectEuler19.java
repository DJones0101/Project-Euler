/**
 * Created by Darius Jones on 6/1/2017.
 */
public class ProjectEuler19 {
    public static void main(String[] args) {

        int count = 0;

        for (int year = 1901; year <= 2000; year++) {
            for (int month = 1; month <= 12; month++) {
                if (dayOfTheWeek(year, month, 1) == 0) {
                    count++;
                }
            }

        }

        System.out.println(count);

    }


    // 0 = Sunday, 1 = Monday,......6 = Saturday.
    public static int dayOfTheWeek(int year, int month, int day) {
        if (year < 1 || month < 1 || month > 12 || day < 1 || day > 31) {
            return -1;
        }

              // Zeller's Congruence
             //  https://en.wikipedia.org/wiki/Zeller%27s_congruence

        int m = (month - 3 + 4800) % 4800;
        int y = (year + m / 12) % 400;
        m %= 12;

        return (y + y / 4 - y / 100 + (13 * m + 2) / 5 + day + 2) % 7;
    }

}
