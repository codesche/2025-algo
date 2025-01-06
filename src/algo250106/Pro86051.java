package algo250106;

import java.util.Arrays;

// 없는 숫자 더하기 (0 ~ 9 까지 조회하여 없는 숫자만 더하기)
public class Pro86051 {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] check = new boolean[10];

        // 순서대로 정렬
        Arrays.sort(numbers);

        // numbers 배열[정수 배열]을 check 배열[불리언 배열]의 요소로 활용
        for (int number : numbers) {
            check[number] = true;
        }

        int length = check.length;
        for (int i = 0; i < length; i++) {
            if (!check[i]) {
                answer += i;
            }
        }

        return answer;
    }
}
