package algo250411;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

// 백준 - 줄 세우기 (실버 5)
public class Baek11536_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        String[] tempArr = Arrays.copyOf(arr, N);
        Arrays.sort(tempArr);

        if (Arrays.equals(arr, tempArr)) {
            sb.append("INCREASING");
        }

        Arrays.sort(tempArr, Collections.reverseOrder());
        if (Arrays.equals(arr, tempArr)) {
            sb.append("DECREASING");
        }

//        System.out.print(sb.isEmpty() ? "NEITHER" : sb);  // Java 15버전 이상부터 가능
        System.out.print(sb.length() != 0 ? sb : "NEITHER");
    }
}
