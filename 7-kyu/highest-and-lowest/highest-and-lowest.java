import java.util.Arrays;
​
public class Kata {
    public static String highAndLow(String numbers) {
        int max = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).max().getAsInt();
        int min = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).min().getAsInt();
        return String.format("%d %d", max, min);
    }
}