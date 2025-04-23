package algo250423;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Collectors.toMap 을 이용한 맵 생성
// Collectors.toMap 을 활용하여 스트림을 맵으로 변환할 수 있다.
// Collectors.toMap은 스트림의 요소를 키-값 쌍으로 매핑하여 맵을 생성. 각 단어를 키로, 단어의 길이를 값으로 저장.
public class StreamToMapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        Map<String, Integer> wordLengthMap = words.stream()
            .collect(Collectors.toMap(word -> word, String::length));

        wordLengthMap.forEach((word, length) -> System.out.println(word + ": " + length));
    }
}
