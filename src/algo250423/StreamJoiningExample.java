package algo250423;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Collectors.joining 으로 문자열 연결
// Collectors.joining 을 사용하면 스트림의 요소들을 하나의 문자열로 결합할 수 있다.
public class StreamJoiningExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "Lambda");

        String result = words.stream()
            .collect(Collectors.joining(", ", "[", "]"));

        System.out.println(result);
    }
}
