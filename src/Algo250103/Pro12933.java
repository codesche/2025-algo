package Algo250103;

import java.util.*;

// 정수 내림차순으로 배치하기
public class Pro12933 {
    public long solution(int n) {
        // n - 118372
        // 해당 정수의 각 자릿수를 문자열 배열에 저장하기
        String[] arr = Long.toString(n).split("");

        // 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());

        // 정렬된 배열 다시 합치기
        StringBuilder sb = new StringBuilder();

        for (String str : arr) {
            sb.append(str);
        }

        return Long.parseLong(sb.toString());
    }

}
