package algo250108;

import java.util.Arrays;

// 최솟값 만들기
public class Pro12941 {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        // B를 역순으로 A와 곱하기
        int aLength = A.length;
        int bLength = B.length;
        for (int i = 0; i < aLength; i++) {
            answer = A[i] * B[bLength - i - 1];
        }

        return answer;
    }
}
