public class Max {
  public static int sequence(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
​
        int maxEnding = arr[0], res = arr[0];
​
        for (int i = 1; i < arr.length; i++)
        {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        res = Math.max(res, 0);
        return res;
  }
}