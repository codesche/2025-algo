package algo250107;

// 약수의 개수와 덧셈
public class Pro77884 {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int count = 0;          // 약수의 개수
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            // count가 짝수인 경우 덧셈, 홀수인 경우 뺄셈
            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }
}
