package algo250108;

// 최대공약수와 최소공배수
public class Pro12940 {
    public int[] solution(int n, int m) {
        int max = Math.max(n, m);
        int min = Math.min(n, m);

        // 최대공약수
        while (min != 0) {
            int r = max % min;
            max = min;
            min = r;
        }

        // 최소공배수: 두 수의 곱 / 최대공약수
        int gcd = n * m / max;
        return new int[]{max, gcd};
    }
}
