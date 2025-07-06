package algo250706;

// 프로그래머스 - 점프와 순간 이동 (Lv2)
public class Pro12980 {
    public int solution(int n) {
        int ans = 0;

        while (n != 0) {            // n을 0으로 만드는 게 핵심
            if (n % 2 == 0) {
                n /= 2;             // 순간이동
            } else {
                n--;                // 점프
                ans++;
            }
        }

        return ans;
    }
}
