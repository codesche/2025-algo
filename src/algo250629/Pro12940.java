package algo250629;

// 프로그래머스 - 최대공약수와 최소공배수 (Lv1)
public class Pro12940 {
    public int[] solution(int n, int m) {
        int max = Math.max(n, m);           // 큰 수 찾기
        int min = Math.min(n, m);           // 작은 수 찾기

        while (min != 0) {
            int r = max % min;
            max = min;
            min = r;
        }

        // 최소공배수 = 두수의 곱 / 최대공약수
        int gcd = n * m / max;
        int[] answer = {max, gcd};

        return answer;
    }
}
