package Algo250105;

// 콜라츠 추측
public class Pro12943 {
    public int solution(long num) {
        int answer = 0;
        int count = 1;

        // 총 4가지 경우를 if문을 활용하여 구성
        while (true) {
            if (num == 1 && count == 1) {
                break;
            } else {
                num = (num % 2 == 0) ? num / 2 : (num * 3) + 1;
            }

            if (count == 500) {
                answer = -1;
                break;
            }
            count++;
        }
        return answer;
    }
}
