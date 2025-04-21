public class Kata {
    public static String rot13(String str) {
        StringBuilder encrStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if (Character.isAlphabetic(c))
            {
                if (c > 'm') c -= 13;
                else if (c >= 'a') c += 13;
                else if (c > 'M') c -= 13;
                else c += 13;
            }
            encrStr.append(c);
        }
        return encrStr.toString();
    }
}