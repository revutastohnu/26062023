package HW12.Methods;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class Methods {

        public static int countOccurance (List<String> wordsList, String targetWord) {
            int count = 0;
            for (String word : wordsList){
                if (word.equals(targetWord))
                    count++;
            }
            return count;
        }


        public static <T> List<T> toList(T[] array) {
            return Arrays.asList(array);
        }


        public static List<Integer> findUnique(List<Integer> numbersList) {
            return new ArrayList<>(new HashSet<>(numbersList));
        }


        public static void calcOccurance(List<String> wordsList) {
            HashMap<String, Integer> wordCount = new HashMap<>();

            for (String word : wordsList) {
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }

            for (String word : wordCount.keySet()) {
                System.out.println(word + ": " + wordCount.get(word));
            }
        }


}
