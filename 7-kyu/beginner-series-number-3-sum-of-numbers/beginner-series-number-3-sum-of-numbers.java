  public class Sum
  {
     public int GetSum(int a, int b)
     {
        int low = Math.min(a, b);
        int high = Math.max(a, b);
        int sum = 0;
        int num = low;
        
        while (num <= high) {
            sum += num;
            num++;
        }
        
        return sum;
     }
  }