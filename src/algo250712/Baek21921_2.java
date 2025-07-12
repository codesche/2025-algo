package algo250712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

// 백준 - 블로그 (실버 3)
public class Baek21921_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {       // 1 4 2 5 1 (1일차 2일차 3일차 4일차 5일차)
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for (int i = 0; i < X; i++) {
            sum += arr[i];                  // 첫 윈도우 합
        }

        int max = sum;
        int count = 1;

        for (int i = X; i < N; i++) {
            sum = sum - arr[i - X] + arr[i];            // 슬라이딩 윈도우 이동
            if (sum > max) {
                max = sum;
                count = 1;
            } else if (sum == max) {
                count++;
            }
        }

        sb.append(max == 0
            ? "SAD"
            : max + "\n" + count);

        System.out.println(sb);
    }
}
