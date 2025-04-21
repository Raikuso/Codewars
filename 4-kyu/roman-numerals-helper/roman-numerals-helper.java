import java.util.Arrays;
​
public class RomanNumerals {
​
    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
​
    public static String toRoman(int n) {
        String result = "";
        for (int i = 0; i < values.length; i++) {
            int repeat = n / values[i];
            result = result.concat(symbols[i].repeat(repeat));
            n -= repeat * values[i];
        }
        return result;
    }
​
    public static int fromRoman(String romanNumeral) {
        int result = 0;
        int index = romanNumeral.length() - 1;
​
        while (index >= 0) {
            String testNumeral;
            int step = 2;
            if (index >= 1) {
                testNumeral = romanNumeral.substring(index - 1, index + 1);
                if (!Arrays.asList(symbols).contains(testNumeral)) {
                    step = 1;
                    testNumeral = romanNumeral.substring(index, index + 1);
                }
            } else {
                step = 1;
                testNumeral = romanNumeral.substring(index, index + 1);
            }
​
            for (int i = 0; i < symbols.length; i++) {
                if (testNumeral.equals(symbols[i])) {
                    result += values[i];
                    break;
                }
            }
​
            index -= step;
        }
        return result;
    }
​
}