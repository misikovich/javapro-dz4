import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> dictionary = Arrays.asList("permission", "television", "meat", "confusion", "village", "media", "delivery", "cell", "judgment", "assumption", "session", "foundation", "connection", "celebration", "fishing");

        countOccurance(getRandomList(dictionary, 20), getRandomWord(dictionary));

        String[] templateWords = {"one", "two", "three"};
        System.out.println(((Object)templateWords).getClass().getSimpleName());
        System.out.println(((Object)toList(templateWords)).getClass().getSimpleName());

        System.out.println(findUnique(Arrays.asList(1, 2, 3, 1, 2, 7, 5, 2, 4, 2, 1, 4)));

        calcOccurance(getRandomList(dictionary, 10));
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

    public static void calcOccurance(List<String> wordList) {
        System.out.println("Calc Occurance");
        if (wordList == null || wordList.isEmpty()) return;

        Map<String, Integer> wordCount = new HashMap<>();

        //count words
        for (String word : wordList) {
            if (wordCount.containsKey(word)) wordCount.put(word, wordCount.get(word) + 1);
            else wordCount.put(word, 1);
        }

        //print words
        System.out.println("'Word': 'repeats'");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet())
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());

    }


}