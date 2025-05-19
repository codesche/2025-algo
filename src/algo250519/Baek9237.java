package algo250519;

import java.io.*;
import java.util.*;

// 백준 - 이장님 초대 (실버 5)
// 묘목을 구입한 날이 1일 -> i는 1부터 시작
public class Baek9237 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[n];                             // 내림차순 고려
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int answer = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = (i + 1) + arr[i];

            if (max < arr[i]) {
                max = arr[i];
            }

            answer = Math.max(arr[i], max);
        }

        System.out.println(answer + 1);
    }
}
