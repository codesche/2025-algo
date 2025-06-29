package algo250629;

// 프로그래머스 - 부족한 금액 계산하기 (Lv1)
public class Pro82612 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;

        for (int i = 1; i < count + 1; i++) {
            total += (long) price * i;
        }

        if (total > money) {
            answer = total - money;
        }

        return answer;
    }
}
