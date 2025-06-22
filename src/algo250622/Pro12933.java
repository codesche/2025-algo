package algo250622;

// 프로그래머스 - 정수 내림차순으로 배치하기 (Lv1)
public class Pro12933 {
    public long solution(long n) {
        int[] count = new int[10];      // 0~9까지 숫자의 개수 저장

        // 각 자릿수의 숫자 카운팅
        while (n > 0) {
            count[(int)(n % 10)]++;
            n /= 10;
        }

        // 큰 수부터 조합
        long answer = 0;
        for (int i = 9; i >= 0; i--) {
            while (count[i]-- > 0) {
                answer = answer * 10 + i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro12933 T = new Pro12933();
        System.out.println(T.solution(118372));
    }
}
