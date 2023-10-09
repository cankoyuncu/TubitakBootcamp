package practice_5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors; // Added import for Collectors

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(List.of("AAAA", "JAVA LANG", "LANGUAGES",
                "SOFTWARE", "LANGUAGES", " ","Tech"));
        System.out.println("stringList");

        List<String> finalList = stringList.stream()
                .filter(string -> !string.isEmpty()) // Fix: Closing the filter before map
                .map(String::toUpperCase)
                .filter(string -> string.contains("A"))
                .sorted(Comparator.reverseOrder())
                .distinct()
                .collect(Collectors.toList()); // Fix: Use collect(Collectors.toList()) to convert to List

        System.out.println(finalList);
    }
}
