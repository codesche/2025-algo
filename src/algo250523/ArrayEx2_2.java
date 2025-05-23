package algo250523;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

// 정수 배열 하나 받아서 배열의 중복값 제거하고 배열 데이터를 내림차순으로 정렬해서 반환 - 다른 풀이
public class ArrayEx2_2 {
    public int[] solution(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int num : arr) {
            set.add(num);
        }

        // int형 배열에 담아서 반환
        int[] answer = new int[set.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = set.pollFirst();
        }

        return answer;
    }

    public static void main(String[] args) {
        ArrayEx2_2 T = new ArrayEx2_2();
        System.out.println(Arrays.toString(T.solution(new int[]{4, 2, 2, 1, 3, 4})));
    }
}
