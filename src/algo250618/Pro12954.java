package algo250618;

// 프로그래머스 - x만큼 간격이 있는 n개의 숫자 (Lv1)
public class Pro12954 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for (int i = 0; i < n; i++) {
            answer[i] = num;

            if (i == n - 1) {
                break;
            }

            num += x;
        }

        return answer;
    }
}
