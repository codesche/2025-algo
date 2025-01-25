package algo250125;

// 소수 찾기 - Lv1
public class Pro12921 {
    public int solution(int n) {
        int answer = 0;
        boolean[] prime = new boolean[n + 1];           // 소수 판별 불리언 배열 선언
        int length = prime.length;

        // 0과 1은 소수가 아니기 때문에 false 선언
        prime[0] = false;
        prime[1] = false;

        // n의 제곱근까지 진행
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // 소수인 경우 뒤에 오는 코드 스킵
            if (prime[i]) {
                continue;
            }

            for (int j = i * i; j < length; j += i) {
                prime[j] = true;
            }
        }

        // false인 것만 추가 (false = 소수)
        for (int i = 2; i < length; i++) {
            if (!prime[i]) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro12921 T = new Pro12921();
        System.out.println(T.solution(10));
    }

}
