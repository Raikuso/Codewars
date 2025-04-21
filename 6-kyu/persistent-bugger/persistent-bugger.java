import java.util.Arrays;
​
class Persist {
    public static int persistence(long n) {
        long res = n;
        int count = 0;
        while (res >= 10) {
          count += 1;
          res = Arrays.stream(String.valueOf(res).split("")).mapToLong(Long::parseLong).reduce(1, (a, b) -> a*b);  
        }
        return count;
    }
}