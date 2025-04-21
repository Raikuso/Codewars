public class NumberUtils {
​
    public static boolean isNarcissistic(int number) {
        String numStr = Integer.toString(number);
        int power = numStr.length();
        return numStr.chars().map(c -> (int) Math.pow(c-'0',power)).sum() == number;
    }
​
}