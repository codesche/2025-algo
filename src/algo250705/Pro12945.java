package algo250705;

// 프로그래머스 - 피보나치 수 (Lv2)
public class Pro12945 {
    public int solution(int n) {
        int[] answer = new int[n + 1];

        answer[0] = 0;
        answer[1] = 1;

        for (int i = 2; i <= n; i++) {
            answer[i] = (answer[i - 2] + answer[i - 1]) % 1234567;
        }

        return answer[n];
    }
}
