package algo250311;

// 기능개발 - Lv2, Queue 사용 X

import java.util.Arrays;

public class Pro42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] temp = new int[100];          // 작업의 개수는 100개 이하여서 100으로 선언
        int day = 0;                        // temp에 적용할 배포일

        // 각 항목마다 100까지 검사해야 하기에 for문 안에 while문 작성
        int length = progresses.length;
        for (int i = 0; i < length; i++) {
            while (progresses[i] + (speeds[i] * day) < 100) {
                day++;
            }
            temp[day]++;            // 다음 기능 개발 일수도 증가
        }

        int count = 0;

        // temp에 들어간 배열의 길이를 알기위한 코드
        // temp는 초기에 0으로 선언되어 있으므로 0이 아닌 값만 측정하면 됨
        for (int n : temp) {        // temp배열 값을 하나씩 n에 적용
            if (n != 0) {
                count++;
            }
        }

        int[] answer = new int[count];

        count = 0;
        for (int n : temp) {
            if (n != 0) {
                answer[count++] = n;        // answer 배열에 temp 값 넣기
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro42586 T = new Pro42586();
        System.out.println(Arrays.toString(T.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
    }

}
