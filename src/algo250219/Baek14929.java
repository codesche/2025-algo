package algo250219;

import java.io.*;
import java.util.*;

// 귀찮아(SIB) - 실버 5
public class Baek14929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 값이 10만개, X의 최댓값인 100으로 모든 값이 입력될 령우 int 형 범위 넘어감을 고려
        long answer = 0;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] prefixSum = new int[N + 1];           // 누적 합 배열

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
            prefixSum[i + 1] = sum;
        }

        for (int i = 0; i < N; i++) {
            int standard = arr[i];
            int calculatedSum = prefixSum[N] - prefixSum[i + 1];
            answer += (long) standard * calculatedSum;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
