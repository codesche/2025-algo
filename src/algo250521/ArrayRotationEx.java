package algo250521;

import java.util.Arrays;

// PCCP 준비 - 배열 회전
// 수정수 배열 arr과 정수 k가 주어질 때, 배열을 오른쪽으로 k칸 회전시킨 결과 구하기
public class ArrayRotationEx {
    public int[] solution(int[] arr, int k) {
        int n = arr.length;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[(i + k) % n] = arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        ArrayRotationEx T = new ArrayRotationEx();
        System.out.println(Arrays.toString(T.solution(new int[]{1, 2, 3, 4, 5}, 3)));
    }
}
