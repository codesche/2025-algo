package algo251214;

// for문을 활용하여 명시적으로 표현, while 제거
public class Pro12911_2 {
    public int solution(int n) {
        int target = Integer.bitCount(n);

        for (int next = n + 1; ; next++) {
            if (Integer.bitCount(next) == target) {
                return next;
            }
        }
    }
}
