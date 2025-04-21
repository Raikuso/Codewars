import java.util.Map;
​
public class PeteBaker {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        int maxCakesThatCanBeMade = Integer.MAX_VALUE;
        for (String ingredient : recipe.keySet())
        {
            Integer availableQuantity = available.get(ingredient);
            if (availableQuantity == null || maxCakesThatCanBeMade == 0) {
                maxCakesThatCanBeMade = 0;
                break;
            }
            int requiredQuantity = recipe.get(ingredient);
            int cakesWithIngredient = Math.floorDiv(availableQuantity, requiredQuantity);
            maxCakesThatCanBeMade = Math.min(maxCakesThatCanBeMade, cakesWithIngredient);
        }
        return maxCakesThatCanBeMade;
    }
}