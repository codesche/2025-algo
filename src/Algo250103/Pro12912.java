package Algo250103;

// 두 정수 사이의 합
public class Pro12912 {
    public long solution(int a, int b) {
        long answer = 0;

        if (a > b) {
            for (long i = b; i <= a; i++) {
                answer += i;
            }
        } else {
            for (long i = a; i <= b; i++) {
                answer += i;
            }
        }

        return answer;
    }
}
