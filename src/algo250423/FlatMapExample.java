package algo250423;

// flatMap을 사용한 다중 리스트 처리
// 개념: flatMap을 사용하여 리스트 안에 있는 리스트들을 하나의 스트림으로 합친다.
// 여러 개의 스트림을 하나의 스트림으로 결합할 때 유용.

import java.util.*;
import java.util.stream.*;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("Apple", "Banana"),
            Arrays.asList("Orange", "Mango"),
            Arrays.asList("Grapes", "Pineapple")
        );

        listOfLists.stream()
            .flatMap(List::stream)      // 내부 리스트를 하나의 스트림으로 평탄화
            .forEach(System.out::println);
    }
}
