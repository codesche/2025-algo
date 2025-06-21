package algo250621;

// 프로그래머스 - 나머지가 1이 되는 수 찾기 (Lv1)
public class Pro87389 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;                      // 제일 작은 수를 찾으면 빠져 나온다.
            }
        }

        return answer;
    }
}
