import java.util.*;

public class WordChecker{
  private ArrayList<String> wordList;

  public WordChecker(ArrayList<String> words) {
    wordList = words;
  }

  public boolean isWordChain() {
    for(int i = 0; i < wordList.size()-1; i++){
      String word1 = wordList.get(i);
      String word2 = wordList.get(i+1);
      if (word2.indexOf(word1) == -1){
        return false;
      }
    }
    return true;
  }

  public ArrayList<String> createList(String target) {
    ArrayList<String> result = new ArrayList<String>();

    for(String s : wordList){
      if(s.indexOf(target) == 0){
        result.add(s.substring(target.length()));
      }
      // System.out.println(result);
    }

    return result;
  }
}
