package algo250423;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 문자열 리스트를 대문자로 변환 (map)
public class StreamFilterExample3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "lambda");
        List<String> upperCaseWords = words.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        System.out.println(upperCaseWords);
    }
}
