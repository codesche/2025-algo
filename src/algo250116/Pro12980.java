package algo250116;

// 점프와 순간 이동 - Lv2
public class Pro12980 {
    public int solution(int n) {
        int ans = 0;

        // 주어진 n이 0이 될 때까지 다음 연산 반복
        // n이 짝수면 n /= 2
        // n이 홀수면 n--
        // 1칸 이동 => 홀수, 순간이동 => 짝수
        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n--;
                ans++;
            }
        }

        return ans;
    }
}
