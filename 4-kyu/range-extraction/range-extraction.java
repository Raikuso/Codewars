class Solution {
    public static String rangeExtraction(int[] arr) {
        StringBuilder range = new StringBuilder();
        Integer startPoint = arr[0], endPoint = arr[0];
​
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != endPoint + 1) {
                if (startPoint.equals(endPoint)) range.append(startPoint).append(",");
                else if (startPoint.equals(endPoint - 1))
                    range.append(startPoint).append(",").append(endPoint).append(",");
                else range.append(startPoint).append("-").append(endPoint).append(",");
                startPoint = arr[i];
            }
            endPoint = arr[i];
        }
​
        if (startPoint.equals(endPoint)) {
            range.append(startPoint);
        } else if (startPoint.equals(endPoint - 1)) {
            range.append(startPoint).append(",").append(endPoint);
        } else {
            range.append(startPoint).append("-").append(endPoint);
        }
​
        return range.toString();
    }
}