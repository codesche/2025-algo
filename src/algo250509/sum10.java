package algo250509;

// 10까지의 합
import java.io.*;
import java.util.*;

// 홀수 합, 짝수 합
public class sum10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 짝수 합
        int evenSum = Arrays.stream(arr).filter(i -> i % 2 == 0).sum();
        int oddSum = Arrays.stream(arr).filter(i -> i % 2 != 0).sum();
        sb.append(evenSum).append("\n");
        sb.append(oddSum);

        System.out.println(sb);
    }
}
