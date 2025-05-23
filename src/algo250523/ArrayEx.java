package algo250523;

import java.util.Arrays;

// 정수 배열 정렬해서 반환하는 솔루션 함수 작성
public class ArrayEx {
    public int[] soluton(int[] arr) {
        int[] answer = new int[arr.length];
        Arrays.sort(arr);

        int idx = 0;
        for (int value : arr) {
            answer[idx++] = value;
        }

        return answer;
    }

    public static void main(String[] args) {
        ArrayEx T = new ArrayEx();
        System.out.println(Arrays.toString(T.soluton(new int[]{1, -5, 2, 4, 3})));
    }
}
