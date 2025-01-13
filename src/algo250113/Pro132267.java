package algo250113;

// 콜라 문제 - Lv1
public class Pro132267 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int newCount = 0;
        int leftover = 0;

        // 빈 병의 개수 n이 교환 가능한 최소 숫자 a 이상일 때까지 반복
        while (n >= a) {
            // 현재 빈 병으로 받을 수 있는 새로운 개수 및 나머지 계산
            newCount = n / a * b;
            leftover = n % a;

            // 정답 반영 및 빈 병 개수 다시 계산
            answer += newCount;
            n = leftover + newCount;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro132267 T = new Pro132267();
        System.out.println(T.solution(2, 1, 20));
    }
}
