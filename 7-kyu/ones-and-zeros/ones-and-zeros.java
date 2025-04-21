import java.util.List;
​
public class BinaryArrayToNumber {
​
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String binaryString = String.join("", binary.stream().map(Object::toString).toArray(String[]::new));
        int binaryNumber = Integer.parseInt(binaryString);
        return Integer.parseInt(binaryString, 2);
    }
}