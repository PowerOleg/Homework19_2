import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    String text;
    Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text.toLowerCase();
    }
    public void splitText() {
        String[] word = text.split(" ");
        for (int i = 0; i < word.length; i++) {
            if (word[i].charAt(word[i].length() - 1) == '.') {
                String[] s = word[i].split("\\.");
                word[i] = s[0];
            } else if (word[i].charAt(word[i].length() - 1) == ',') {
                String[] s = word[i].split(",");
                word[i] = s[0];
            } else set.add(word[i]);
        }
    }
    public boolean hasWord(String word) {
        for (String s : set){
            if (text.contains(word.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
