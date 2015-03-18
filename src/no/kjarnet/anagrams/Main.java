package no.kjarnet.anagrams;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static final String FILE_CHARSET = "ISO-8859-1";

    private static final String FILE_NAME = "ordbok.txt";

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Path path = Paths.get(FILE_NAME);
        try(Stream<String> lines = Files.lines(path, Charset.forName(FILE_CHARSET))){
            Map<String, List<String>> groupedBySortedChars = lines.collect(Collectors.groupingBy(Main::getSortedChars));
            groupedBySortedChars.entrySet().stream().filter(e -> e.getValue().size() > 1).forEach(
                    e -> System.out.println(String.join(",", e.getValue())));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String getSortedChars(String word) {
        return word.chars().sorted().mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining());
    }

}
