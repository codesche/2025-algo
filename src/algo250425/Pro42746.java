package algo250425;

import java.util.Arrays;

// 프로그래머스 - 가장 큰 수 (Lv2)
public class Pro42746 {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[numbers.length];
        int length = arr.length;

        // 문자열 배열 요소 삽입
        for (int i = 0; i < length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        // 비교하는 두 숫자를 앞, 뒤로 번갈아가며 이어붙인 것을 기준으로 비교
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        // 0이 제일 앞일 경우 "000..." -> "0" 리턴
        if (arr[0].equals("0")) {
            return "0";
        }

        for (int i = 0; i < length; i++) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}
