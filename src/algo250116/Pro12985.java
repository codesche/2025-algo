package algo250116;

// 예상 대진표 - Lv2
public class Pro12985 {
    public int solution(int n, int a, int b) {
        int answer = 0;

        while (a != b) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;

            answer++;
        }
        return answer;
    }
}
