import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;

public class WordsChecker {
    private Set<String> set;

    public WordsChecker(String text) {
        text = removePunctuations(text);
        this.set = new HashSet<>(asList(text.split(" ")));
    }

    /**
     * данный метод осуществляет поиск переданного параметром слова в тексте.
     *
     * @param word слово, которое нужно найти в тексте.
     * @return true - если переданное слово есть в тексте,false - если его нет.
     */
    public boolean hasWord(String word) {
        if (set.contains(word.toLowerCase())) {
            System.out.println("The word: " + "\"" + word + "\"" + " is in this text!");
            return true;
        }
        System.out.println("The word: " + "\"" + word + "\"" + " is not in this text!");
        return false;
    }

    /**
     * @param text
     * @return текст без знаков препинания.
     */
    private static String removePunctuations(String text) {
        return text.replaceAll("\\p{Punct}", "").toLowerCase();
    }
}