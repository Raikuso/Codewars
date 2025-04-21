public class SpinWords {
​
  public String spinWords(String sentence) {
    String wordArray[] = sentence.split(" ");
    String reversedSentence = "";
    for (String s : wordArray)
    {
      if (s.length() > 4)
      {
        StringBuilder sb = new StringBuilder(s);
        reversedSentence += sb.reverse().toString() + " ";
      }
      else
      {
        reversedSentence += s + " ";
      }
    }
    return reversedSentence.trim();
  }
}