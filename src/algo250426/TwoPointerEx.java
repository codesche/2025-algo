package algo250426;

import java.io.*;
import java.util.*;

// 투포인터 - 두 배열 합치기
public class TwoPointerEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] arr2 = new int[M];
        for (int j = 0; j < M; j++) {
            arr2[j] = Integer.parseInt(st.nextToken());
        }

        int[] sumArr = new int[N + M];
        int idx = 0;
        for (int k = 0; k < sumArr.length; k++) {
            if (k < N) {
                sumArr[k] = arr1[k];
            } else {
                sumArr[k] = arr2[idx++];
            }
        }

        Arrays.sort(sumArr);

        for (int j : sumArr) {
            System.out.print(j + " ");
        }
    }
}
