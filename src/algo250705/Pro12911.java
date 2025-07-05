package algo250705;

// 프로그래머스 - 다음 큰 숫자 (Lv2)
public class Pro12911 {
    public int solution(int n) {
        int currentCount = Integer.bitCount(n);

        while (true) {
            n++;
            int nextCount = Integer.bitCount(n);

            if (currentCount == nextCount) {
                break;
            }
        }

        return n;
    }
}
