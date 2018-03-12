/**
 * Created by Darius Jones on 5/30/2017.
 * <p>
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.If all the numbers
 * from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115
 * (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with
 * British usage.
 */
public class ProjectEuler17 {

    public static String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve",
            "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    public static String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};


    public static String convert(int n) {
        if (n > 0 && n < 20) {
            return ones[n];
        } else if (n >= 20 && n < 100) {
            return tens[n / 10] + (n % 10 == 0 ? "" : ones[n % 10]);
        } else if (n >= 100 && n < 1000) {
            return ones[n / 100] + "hundred" + (n % 100 == 0 ? "" : "and" + convert(n % 100));
        } else if (n >= 1000) {
            return ones[n / 1000] + "thousand" + convert(n % 1000);
        }
        return "";
    }

    public static void main(String[] args) {
        int answer = 0;
        for (int i = 0; i <= 1000; i++) {
            answer += convert(i).length();
        }

        System.out.println(answer);
    }

}
