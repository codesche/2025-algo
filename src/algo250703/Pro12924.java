package algo250703;

// 프로그래머스 - 숫자의 표현 (Lv2)
public class Pro12924 {
    public int solution(int n) {
        int answer = 0;

        // 1부터 n까지 총합이 n이 되는 경우의 수 찾기
        for (int num = 1; num <= n; num++) {
            int total = 0;
            for (int i = num; i <= n; i++) {
                total += i;

                if (total == n) {
                    answer++;
                    break;
                }

                if (total > n) {
                    break;
                }
            }
        }

        return answer;
    }

}
