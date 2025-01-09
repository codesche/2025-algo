package algo250109;

// 다음 큰 숫자 - Lv2
public class Pro12911 {
    public int solution(int n) {
        int nowCount = Integer.bitCount(n);

        while (true) {
            n++;
            int nextCount = Integer.bitCount(n);

            if (nowCount == nextCount) {
                break;
            }
        }

        return n;
    }
}
