package algo250627;

// 프로그래머스 - 콜라츠 추측 (Lv1)
public class Pro12943 {
    public int solution(long num) {
        int answer = 0;

        // 반복 시작
        while (num != 1) {
            if (answer == 500) return -1;

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num * 3) + 1;
            }

            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro12943 p = new Pro12943();
        System.out.println(p.solution(626331));
    }

}
