package algo251022;

import java.io.*;
import java.util.*;

// 백준 - 수열의 변화 (브론즈 1), [14204 KB, 104 ms]
public class Baek1551 {
    public static void main(String[] args) throws IOException {
        // N, K 입력
        // 간격 적용은 StringTokenizer로
        // 수열을 이루고 있는 수를 ','와 같이 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String input = br.readLine();

        // 먼저 기존 배열을 생성해야 함
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input.split(",")[i]);
        }

        // K번 반복을 해서 최종 수열을 구해야 함
        // B[i] = A[i + 1] - A[i]
        // 식을 통해 만들어진 수열은 가변 수열이므로 리스트 활용이 필요할 듯
        // 0 1, 1 2, 2 3, 3,4
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < N - 1; j++) {
                A[j] = A[j + 1] - A[j];
            }
            N--;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(A[i]);
        }
        System.out.println(sb);
    }
}
