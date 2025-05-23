package algo250523;

import java.util.*;

// 정수 배열 하나 받아서 배열의 중복값 제거하고 배열 데이터를 내림차순으로 정렬해서 반환
public class ArrayEx2 {
    public int[] solution(int[] arr) {
        Integer[] array = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);

        Arrays.sort(array, Collections.reverseOrder());     // 내림차순 정렬

        return Arrays.stream(array).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        ArrayEx2 T = new ArrayEx2();
        System.out.println(Arrays.toString(T.solution(new int[]{4, 2, 2, 1, 3, 4})));
    }
}
