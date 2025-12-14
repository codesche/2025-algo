package algo251214;

// 메서드 분리 - 훨씬 괜찮음
public class Pro12911_3 {

    public int solution(int n) {
        int count = countBits(n);
        int candidate = n + 1;

        while (countBits(candidate) != count) {
            candidate++;
        }

        return candidate;
    }

    private int countBits(int value) {
        return Integer.bitCount(value);
    }
}
