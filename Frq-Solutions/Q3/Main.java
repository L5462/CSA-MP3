import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Part A Testing
    ArrayList<String> listA = new ArrayList<String>();
    listA.add("an");
    listA.add("band");
    listA.add("band");
    listA.add("abandon");
    WordChecker checker1 = new WordChecker(listA);
    System.out.println(checker1.isWordChain());

    // Part B Testing
    ArrayList<String> listB = new ArrayList<String>();
    listB.add("catch");
    listB.add("bobcat");
    listB.add("catchacat");
    listB.add("cat");
    listB.add("at");
    WordChecker checker2 = new WordChecker(listB);
    System.out.println(checker2.createList("cat"));
    System.out.println(checker2.createList("catch"));
    System.out.println(checker2.createList("dog"));

  }

}
