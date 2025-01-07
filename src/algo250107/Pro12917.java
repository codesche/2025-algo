package algo250107;

import java.util.Arrays;

// 문자열 내림차순으로 배치하기
public class Pro12917 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();

        Arrays.sort(arr);
        int length = arr.length;

        for (int i = length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}
