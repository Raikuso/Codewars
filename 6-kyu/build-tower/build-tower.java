import java.util.Arrays;
​
public class Kata
{
    public static String[] towerBuilder(int nFloors)
    {
        if (nFloors==0)
            return new String[]{};
​
        int towerWidth = getTowerWidth(nFloors);
        String[] dirtTower = new String[nFloors];
​
        for (int i = nFloors - 1; i >= 0; i--) {
            int empty = nFloors - (nFloors - i);
            String emptyFields = " ".repeat(empty);
            String dirtBlocks = "*".repeat(towerWidth - 2*empty);
            String floor = emptyFields + dirtBlocks + emptyFields;
​
            dirtTower[nFloors - 1 - i] = floor;
        }
        return dirtTower;
    }
​
    public static int getTowerWidth(int nFloors)
    {
        int towerWidth = 1;
        for (int i = 0; i < nFloors-1; i++)
        {
            towerWidth += 2;
        }
        return towerWidth;
    }
​
​
}
​
​