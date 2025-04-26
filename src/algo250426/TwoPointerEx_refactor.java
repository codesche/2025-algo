package algo250426;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 투포인터 - 두 배열 합치기
/*
3 4
1 3 5
2 4 6 7
 */
public class TwoPointerEx_refactor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr1 = new int[N];
        int[] arr2 = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < M; j++) {
            arr2[j] = Integer.parseInt(st.nextToken());
        }

        int p1 = 0;
        int p2 = 0;
        StringBuilder sb = new StringBuilder();

        while (p1 < N && p2 < M) {
            if (arr1[p1] <= arr2[p2]) {
                sb.append(arr1[p1++]).append(" ");
            } else {
                sb.append(arr2[p2++]).append(" ");
            }
        }

        // 남은 것도 출력
        while (p1 < N) {
            sb.append(arr1[p1++]).append(" ");
        }

        while (p2 < M) {
            sb.append(arr2[p2++]).append(" ");
        }

        System.out.println(sb);
    }
}
