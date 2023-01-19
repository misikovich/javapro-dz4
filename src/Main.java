import java.util.*;

public class Main {
    public static void main(String[] args) {
        final List<String> dictionary = Arrays.asList("permission", "television", "meat", "confusion", "village", "media", "delivery", "cell", "judgment", "assumption", "session", "foundation", "connection", "celebration", "fishing");

        countOccurance(getRandomList(dictionary, 20), getRandomWord(dictionary));

        String[] templateWords = {"one", "two", "three"};
        System.out.println(((Object)templateWords).getClass().getSimpleName());
        System.out.println(((Object)toList(templateWords)).getClass().getSimpleName());

        System.out.println(findUnique(Arrays.asList(1, 2, 3, 1, 2, 7, 5, 2, 4, 2, 1, 4)));

        calcOccurance(getRandomList(dictionary, 10));
        System.out.println(findOccurance(getRandomList(dictionary, 10)));
    }

    public static void countOccurance(List<String> strings, String string) {
        System.out.println("Count Occurance");
        int repeats = 0;
        for (String s : strings) {
            if (string.equals(s)) {
                repeats++;
            }
        }
        System.out.printf("Слово %s повторювалося стільки разів: %s%n", string, repeats);
    }

    public static List<String> getRandomList(List<String> dict, int num) {
        Random rand = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(dict.get(rand.nextInt(dict.size())));
        }
        return list;
    }

     public static String getRandomWord(List<String> dict) {
        if (dict == null || dict.isEmpty()) return null;

        Random rand = new Random();
        return dict.get(rand.nextInt(dict.size()));
    }

    public static List<String> toList(String[] array) {
        if (array == null) return null;
        
        return Arrays.asList(array);
    }

    public static List<Integer> findUnique(List<Integer> nums) {
        System.out.println("Find Unique");
//      check for null
        if (nums == null || nums.isEmpty()) return null;

        List<Integer> unique = new ArrayList<>();
        for (int num : nums) {
            if (!unique.contains(num)) {
                unique.add(num);
            }
        }
        return unique;
    }

    public static void calcOccurance(List<String> strings) {
        System.out.println("Calc Occurance");
        if (strings == null || strings.isEmpty()) return;

        Map<String, Integer> count = new HashMap<>();

        //count words
        for (String word : strings) {
            if (count.containsKey(word)) count.put(word, count.get(word) + 1);
            else count.put(word, 1);
        }

        //print words
        System.out.println("'Word': 'repeats'");
        for (Map.Entry<String, Integer> entry : count.entrySet())
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());

    }

    public static ArrayList<Occurance> findOccurance(List<String> strings) {
        System.out.println("Calc Occurance");
        if (strings == null || strings.isEmpty()) return null;

        Map<String, Integer> count = new HashMap<>();

        //count words
        for (String word : strings) {
            if (count.containsKey(word)) count.put(word, count.get(word) + 1);
            else count.put(word, 1);
        }

        ArrayList<Occurance> occurances = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            occurances.add(new Occurance(entry.getKey(), entry.getValue()));
        }

        return occurances;
    }
}
