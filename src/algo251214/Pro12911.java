package algo251214;

// 프로그래머스 - 다음 큰 숫자

/**
 * 조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
 * 조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
 * 조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다
 */

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
