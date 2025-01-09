package algo250109;

// 숫자의 표현 - Lv2
public class Pro12924 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= 15; i++) {
            int sum = 0;

            for (int j = i; j <= n; j++) {
                sum += j;

                // 1부터 n까지 자연수를 더하면서 합을 계산하기
                if (sum == n) {
                    answer++;
                    break;
                }

                // 합이 주어진 n보다 더 큰 경우 내부 반복문 종료하기
                if (sum > n) {
                    break;
                }
            }
        }

        return answer;
    }
}
