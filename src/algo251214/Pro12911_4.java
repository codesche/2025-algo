package algo251214;

import java.util.stream.IntStream;

// 비추천, 성능 떨어짐
public class Pro12911_4 {
    public int solution(int n) {
        int count = Integer.bitCount(n);

        return IntStream.iterate(n + 1, i -> i + 1)
                .filter(i -> Integer.bitCount(i) == count)
                .findFirst()
                .getAsInt();
    }
}
