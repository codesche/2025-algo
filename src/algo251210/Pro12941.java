package algo251210;

import java.util.*;

// 프로그래머스 - 최솟값 만들기 (Lv2)
// 길이가 같은 두 배열이 핵심 (결국엔 B 배열을 역순으로 변경할 수 있게 해주는 것)
public class Pro12941 {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        // B를 역순으로 A와 곱하면 최솟값을 구할 수 있음
        int aLength = A.length;
        int bLength = B.length;

        for (int i = 0; i < aLength; i++) {
            answer += A[i] * B[bLength - i - 1];
        }

        return answer;
    }
}
