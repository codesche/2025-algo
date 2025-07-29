package algo250729;

// 프로그래머스 - 콜라 문제 (Lv1)
public class Pro132267 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int leftover = 0;
        int cola = 0;

        while (n >= a) {
            cola = (n / a) * b;
            leftover = n % a;
            answer += cola;
            n = cola + leftover;
        }

        return answer;
    }
}
