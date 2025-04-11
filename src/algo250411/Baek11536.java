package algo250411;

import java.io.*;

// 백준 - 줄 세우기 (실버 5), 실패 소스
public class Baek11536 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        int deCount = 0;            // 증가 카운트
        int inCount = 0;            // 감소 카운트

        for (int i = 1; i < N; i++) {
            if (arr[i - 1].charAt(0) < arr[i].charAt(0)) {
                inCount++;
            } else if (arr[i - 1].charAt(0) > arr[i].charAt(0)) {
                deCount++;
            }
        }

        if (inCount != 0 && deCount == 0) {
            sb.append("INCREASING");
        } else if (deCount != 0 && inCount == 0) {
            sb.append("DECREASING");
        } else if (deCount != 0) {
            sb.append("NEITHER");
        }

        System.out.print(sb);
    }
}
