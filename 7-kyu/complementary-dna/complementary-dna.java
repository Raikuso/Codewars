import java.util.*;
​
public class DnaStrand {
  public static String makeComplement(String dna) {
        if (dna == null)
            return "";
    
        StringBuilder complementDNA = new StringBuilder();
    
        Map<Character, Character> dnaMap
                = new HashMap<Character, Character>();
        dnaMap.put('A','T');
        dnaMap.put('T','A');
        dnaMap.put('C','G');
        dnaMap.put('G','C');
        
        for (int i = 0; i < dna.length(); i++)
        {
            char c = dna.charAt(i);
            complementDNA.append(dnaMap.get(c));
        }
        return complementDNA.toString();
  }
}