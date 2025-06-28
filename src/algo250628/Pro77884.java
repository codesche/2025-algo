package algo250628;

// 프로그래머스 - 약수의 개수와 덧셈 (Lv1)
public class Pro77884 {
    public int solution(int left, int right) {
        int answer = 0;

        // 약수의 개수 - 짝수(더하기), 홀수(빼기)
        int length = right - left + 1;

        for (int i = 0; i < length; i++) {
            answer += checkValue(left++);
        }

        return answer;
    }

    private int checkValue(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int checkNumber = (count % 2 == 0) ? number : number * (-1);

        return checkNumber;
    }
}
