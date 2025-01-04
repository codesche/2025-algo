package Algo250103;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// 나누어 떨어지는 숫자 배열
public class Pro12910 {
    public int[] solution(int[] arr, int divisor) {
        // 리스트 선언
        List<Integer> list = new ArrayList<>();

        // 리스트에 담기
        for (int value : arr) {
            if (value % divisor == 0) {
                list.add(value);
            }
        }

        // list size 변수에 담기
        int size = list.size();

        // 나누어 떨어지는 요소가 없을 경우
        if (list.isEmpty()) {
            list.add(-1);
            size = 1;
        }

        // 리스트에 추가된 요소들 배열에 담기
        int[] answer = new int[size];
        int length = answer.length;

        for (int i = 0; i < length; i++) {
            answer[i] = list.get(i);
        }

        // 오름차순 배열
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Pro12910 T = new Pro12910();
        System.out.println(Arrays.toString(T.solution(new int[]{3, 2, 6}, 10)));
    }
}
