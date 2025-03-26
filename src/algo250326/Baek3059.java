package algo250326;

import java.io.*;

// 백준 - 등장하지 않는 문자의 합 (브론즈 3), 중복 처리를 고려 해야 함
public class Baek3059 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            int total = 2015;
            boolean[] visited = new boolean[26];

            // 중복 제거 필요
            for (char c : str.toCharArray()) {
                if (!visited[c - 'A']) {
                    total -= c;
                    visited[c - 'A'] = true;
                }
            }

            bw.write(String.valueOf(total));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
