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
            String[] s = word[i].split("\\P{IsAlphabetic}+");
            set.add(s[0]);
        }
    }

    public boolean hasWord(String word) {
        for (String s : set) {
            if (text.contains(word.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
