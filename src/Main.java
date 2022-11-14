import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    private static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
            " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam," +
            " quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat." +
            " Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur." +
            " Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void containsKey(Map<Character, Integer> hashMap, char ch) {
        int value = hashMap.get(ch);
        value++;
        hashMap.put(ch, value);
    }

    public static void main(String[] args) {
        Map<Character, Integer> hashMap = new HashMap<>();
        Iterator<Integer> iterator = text.toLowerCase().chars().iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            char ch = (char) i;
            if (!hashMap.containsKey(ch)) hashMap.put(ch, 1);
            else containsKey(hashMap, ch);
        }
        List<Map.Entry<Character, Integer>> hashMap1 =
                hashMap.entrySet().stream().filter(n -> Character.isLetter(n.getKey())).collect(Collectors.toList());
        hashMap1.sort((o1, o2) -> o1.getValue() - o2.getValue());

        String min = String.valueOf(hashMap1.get(0));
        String max = String.valueOf(hashMap1.get(hashMap1.size() - 1));
        System.out.printf("The letter %s appears the most often\n", max.charAt(0));
        System.out.printf("The letter %s is the rarest\n", min.charAt(0));
        System.out.println();
        System.out.println("To check yourself let's take a look at the list:");
        hashMap1.stream().forEach(System.out::println);
    }
}
