package algo250423;

import java.util.*;
import java.util.stream.*;

// forEachOrdered 를 이용한 순차적 처리
// forEach는 스트림을 순서대로 처리하지만 parallelStream()을 사용할 경우 순서가 보장되지 않음
// 이때 forEachOrdered 를 사용하면 순차적 처리가 가능
// forEachOrdered : 병렬 스트림에서 순차적인 처리를 보장하는 메서드
public class StreamForEachOrderedExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        names.parallelStream()
            .forEachOrdered(System.out::println);
    }
}
