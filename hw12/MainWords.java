import java.util.*;

public class MainWords {
    public static void main(String[] args) {
        String text = "Серед величезного багатства української народної творчості народні прислів’я та приказки займають важливе місце. " +
                "Прислів’я та приказки становлять один вид поетичної творчості. Це стислі художні вислови народу про різні життєві явища. " +
                "Вони є одним із найпоширеніших видів народної поетичної творчості, який побутував іще в сиву давнину і дійшов аж до нашого часу.\n";
        text = text.replaceAll("[.,]", "");
        String[] wordsArray = text.split("\\s+"); // розділяє текст за пробілами та символами кінця рядка

        List<String> words = new ArrayList<>(Arrays.asList(wordsArray));
        System.out.println("Список слів:");
        System.out.println(words);

        Map<String, Integer> frequencyWords = new HashMap<>();

        for (String word : words) {
            frequencyWords.put(word, frequencyWords.getOrDefault(word, 0) + 1);
        }

        System.out.println("Унікальні слова:");
        for (String word : frequencyWords.keySet()) {
            if (frequencyWords.get(word) < 2){
                System.out.println(word + ": " + frequencyWords.get(word));
            }
        }

        System.out.println("Слова які повторюються:");
        for (String word : frequencyWords.keySet()) {
            if (frequencyWords.get(word) > 1){
                System.out.println(word + ": " + frequencyWords.get(word));
            }
        }

    }
}
