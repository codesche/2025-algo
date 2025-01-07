package algo250107;

// 부족한 금액 계산하기
public class Pro82612 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;
        long temp = 0;

        // 누적합
        for (int i = 0; i < count; i++) {
            temp += price;
            total += temp;
        }

        if (total > money) {
            answer = total - money;
        } else {
            return 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro82612 T = new Pro82612();
        System.out.println(T.solution(3, 20, 4));
    }
}
