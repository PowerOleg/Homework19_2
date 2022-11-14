import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    String text;
    //Set потому что слова должны не повторяться в коллекции
    Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text.toLowerCase();
    }
public void splitText() {
        String[] word = text.split(" ");
    for (int i = 0; i < word.length; i++) {
        if (word[i].charAt(word[i].length() - 1) == '.')  {
            String[] s = word[i].split("\\.");
            word[i] = s[0];
        } else if (word[i].charAt(word[i].length() - 1) == ',') {
            String[] s = word[i].split(",");
            word[i] = s[0];
        } else set.add(word[i]);
        System.out.println(word[i]);
    }

}

//    public boolean hasWord(String word) {
//        for ( : ) {
//            text.contains(word);
//        }
//        return true;
//    }

}
